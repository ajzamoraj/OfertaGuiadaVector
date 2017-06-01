package com.isb.og.wsdl.ofegui.config;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.xml.transform.StringSource;

import com.isb.og.model.ObtRepresentantesRQ;
import com.isb.og.security.helper.SoapHelper;
import com.isb.og.security.model.SeguridadTokenBean;
import com.isb.og.security.wsdl.facseg.ComIsbAlFacsegSecurityCbCBCredentialDataType;
import com.isb.og.security.wsdl.facseg.GetLoggedUserToken;
import com.isb.og.security.wsdl.facseg.GetLoggedUserTokenResponse;
import com.isb.og.security.wsdl.facseg.VerifyCredential;
import com.isb.og.security.wsdl.facseg.VerifyCredentialResponse;
import com.isb.og.wsdl.ofegui.ComIsbSanoguServiciosdirogEFCbObtRepresentantesEType;
import com.isb.og.wsdl.ofegui.NUMPERSONACLIENTEType;
import com.isb.og.wsdl.ofegui.ObtRepresentantes;
import com.isb.og.wsdl.ofegui.ObtRepresentantesResponse;

@PropertySource("classpath:soap.properties")
public class OfeGuiClient extends WebServiceGatewaySupport {
	
	private static final Logger LOGGER = Logger.getLogger(OfeGuiClient.class);

	@Value("${soap.config.path.ofegui.uri}")
	private String URI;
	
	@Value("${soap.config.path.ofegui.facade}")
	private String FACADE;
	
	//Actions:
	
	@Value("${soap.config.path.ofegui.action.obtRepresentantes}")
	private String ACTION_OBT_REPRESENTANTES;
	
	
	private SoapHelper helper = new SoapHelper();


	public ObtRepresentantesResponse obtRepresentantes(ObtRepresentantesRQ datosEntrada ) {

		LOGGER.info("Requesting token for logged user with token " + datosEntrada.getOriginalToken());
		
		//Seteamos los datosen el objeto que enviamos.
		ObtRepresentantes request = new ObtRepresentantes();
		ComIsbSanoguServiciosdirogEFCbObtRepresentantesEType entrada = new ComIsbSanoguServiciosdirogEFCbObtRepresentantesEType();
		entrada.setCanal("canal");
		entrada.setEmpresa("empresa");
		entrada.setIndRepo("indrepo");
		entrada.setMemento("memento");
		NUMPERSONACLIENTEType representado = new NUMPERSONACLIENTEType();
		representado.setCODIGODEPERSONA(0);
		representado.setTIPODEPERSONA("F");
		entrada.setRepresentado(representado);
		request.setEntrada(entrada );
		request.setFacade(FACADE);


		ObtRepresentantesResponse response = (ObtRepresentantesResponse) getWebServiceTemplate()
				.marshalSendAndReceive(URI,
						request,
						new SoapActionCallback(ACTION_OBT_REPRESENTANTES)
				{
					
			        public void doWithMessage(WebServiceMessage message) {
			            try {
			                SoapMessage soapMessage = (SoapMessage)message;
			                SoapHeader header = soapMessage.getSoapHeader();
			                StringSource headerSource = helper.getSecurityByToken(datosEntrada.getOriginalToken());

			                Transformer transformer = TransformerFactory.newInstance().newTransformer();
			                transformer.transform(headerSource, header.getResult());
			            } catch (Exception e) {
			                // exception handling
			            	LOGGER.debug("Error: " + e.getMessage());
			            }
			        }
				}
				);

		return response;
	}
}

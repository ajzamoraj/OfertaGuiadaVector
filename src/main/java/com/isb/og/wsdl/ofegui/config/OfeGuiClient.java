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

import com.isb.og.security.helper.SoapHelper;
import com.isb.og.security.model.SeguridadTokenBean;
import com.isb.og.security.wsdl.facseg.ComIsbAlFacsegSecurityCbCBCredentialDataType;
import com.isb.og.security.wsdl.facseg.GetLoggedUserToken;
import com.isb.og.security.wsdl.facseg.GetLoggedUserTokenResponse;
import com.isb.og.security.wsdl.facseg.VerifyCredential;
import com.isb.og.security.wsdl.facseg.VerifyCredentialResponse;

@PropertySource("classpath:soap.properties")
public class OfeGuiClient extends WebServiceGatewaySupport {
	
	private static final Logger LOGGER = Logger.getLogger(OfeGuiClient.class);

	@Value("${soap.config.path.ofegui.uri}")
	private String URI;
	
	@Value("${soap.config.path.ofegui.facade}")
	private String FACADE;
	
	@Value("${soap.config.path.ofegui.action.obtRepresentantes}")
	private String ACTION_VERIFY_CREDENTIAL;
	
	@Value("${soap.config.path.ofegui.action.buscGestoraFI}")
	private String ACTION_USER_TOKEN;
	
	private SoapHelper helper = new SoapHelper();


	public GetLoggedUserTokenResponse getLoggedUserToken(SeguridadTokenBean token ) {

		LOGGER.info("Requesting token for logged user with token " + token.getOriginalToken());
		GetLoggedUserToken request = new GetLoggedUserToken();
		request.setFacade(FACADE);


		GetLoggedUserTokenResponse response = (GetLoggedUserTokenResponse) getWebServiceTemplate()
				.marshalSendAndReceive(URI,
						request,
						new SoapActionCallback(ACTION_USER_TOKEN)
				{
					
			        public void doWithMessage(WebServiceMessage message) {
			            try {
			                SoapMessage soapMessage = (SoapMessage)message;
			                SoapHeader header = soapMessage.getSoapHeader();
			                StringSource headerSource = helper.getSecurityByToken(token.getOriginalToken());

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
	
	
	public VerifyCredentialResponse verifyCredential(SeguridadTokenBean token ) {
		
		VerifyCredential request = new VerifyCredential();
		ComIsbAlFacsegSecurityCbCBCredentialDataType credential = new ComIsbAlFacsegSecurityCbCBCredentialDataType();
		credential.setTokenCredential(token.getOriginalToken());
		request.setCBCredentialData(credential);
		
		request.setFacade(FACADE);

		LOGGER.info("Requesting verify for token " +token.getOriginalToken());

		VerifyCredentialResponse response = (VerifyCredentialResponse) getWebServiceTemplate()
				.marshalSendAndReceive(URI,
						request,
						new SoapActionCallback(ACTION_VERIFY_CREDENTIAL)
				{
					
			        public void doWithMessage(WebServiceMessage message) {
			            try {
			                SoapMessage soapMessage = (SoapMessage)message;
			                SoapHeader header = soapMessage.getSoapHeader();
			                StringSource headerSource = helper.getSecurityByToken(token.getOriginalToken());

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

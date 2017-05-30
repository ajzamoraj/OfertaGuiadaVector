package com.isb.wphg.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.isb.wphg.security.model.SeguridadTokenBean;
import com.isb.wphg.security.service.ISecurityService;
import com.isb.wphg.security.wsdl.facseg.GetLoggedUserTokenResponse;
import com.isb.wphg.security.wsdl.facseg.config.FacSegClient;


@Service
public class SecurityServiceImpl implements ISecurityService {
	
	@Autowired
	private FacSegClient facsegClient;

	@Override
	public SeguridadTokenBean getLoggedUserToken(SeguridadTokenBean token) {

		GetLoggedUserTokenResponse loggedUserToken = facsegClient.getLoggedUserToken(token);
		token.setGeneratedlToken(loggedUserToken.getMethodResult());
		return token;
	}

	@Override
	public SeguridadTokenBean verifyCredential(SeguridadTokenBean token) {
		try {
			facsegClient.verifyCredential(token);
			token.setValidToken(true);
			return token;
		} catch (SoapFaultClientException sfce){
			token.setValidToken(false);
			throw sfce;
		} 
	}

}

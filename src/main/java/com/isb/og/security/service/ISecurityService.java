package com.isb.og.security.service;

import com.isb.og.security.model.SeguridadTokenBean;

public interface ISecurityService {

	public SeguridadTokenBean getLoggedUserToken(SeguridadTokenBean token);
	
	public SeguridadTokenBean verifyCredential (SeguridadTokenBean token);
}

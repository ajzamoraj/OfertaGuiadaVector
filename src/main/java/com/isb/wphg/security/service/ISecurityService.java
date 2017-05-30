package com.isb.wphg.security.service;

import com.isb.wphg.security.model.SeguridadTokenBean;

public interface ISecurityService {

	public SeguridadTokenBean getLoggedUserToken(SeguridadTokenBean token);
	
	public SeguridadTokenBean verifyCredential (SeguridadTokenBean token);
}

package com.isb.wphg.security.model;

import com.isb.wphg.common.model.ModelResult;

public class SeguridadTokenBean extends ModelResult {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -226993461818698783L;
	private String originalToken;
	private String generatedlToken;
	private boolean isValidToken;

	public String getOriginalToken() {
		return originalToken;
	}

	public void setOriginalToken(String token) {
		this.originalToken = token;
	}

	public String getGeneratedlToken() {
		return generatedlToken;
	}

	public void setGeneratedlToken(String generatedlToken) {
		this.generatedlToken = generatedlToken;
	}

	public boolean isValidToken() {
		return isValidToken;
	}

	public void setValidToken(boolean isValidToken) {
		this.isValidToken = isValidToken;
	}
	
	

}

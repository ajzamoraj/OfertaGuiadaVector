package com.isb.og.security.common.enumerated;

/**
 * Enumerated class with the security types.
 * 
 * @author Vector ITC Group
 */
public enum EnumSecurityTypes {
    
    NO_SECURED("NO_SECURED"),
    SECURED_BY_TOKEN("SECURED_BY_TOKEN");
    
    private String securityType;
    
    /**
     * Constructor.
     * 
     * @param securityType {@link String}
     */
    private EnumSecurityTypes(final String securityType) {
        this.securityType = securityType;
    }
    
    /**
     * Gets the security Type
     * 
     * @return securityType {@link String}
     */
    public final String getSecurityType(){
        return securityType;
    }
    
}

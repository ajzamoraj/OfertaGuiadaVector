package com.isb.wphg.security.helper;

import org.springframework.xml.transform.StringSource;

public class SoapHelper {

	public StringSource getSecurityByUserAndPass(String user, String pass){
        StringSource result = new StringSource(
        		
//				"<wsse:Username>70064316Z</wsse:Username>\n"+
//				"<wsse:Password>14725836</wsse:Password>\n"+

        		"<wsse:Security SOAP-ENV:actor=\"http://www.isban.es/soap/actor/wssecurityUserPass\" SOAP-ENV:mustUnderstand=\"1\" S12:role=\"wsssecurity\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:S12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+
			"<wsse:UsernameToken>\n"+
				"<wsse:Username>"+user+"</wsse:Username>\n"+
				"<wsse:Password>"+pass+"</wsse:Password>\n"+
			"</wsse:UsernameToken>\n"+
		"</wsse:Security>\n" );
        return result;
		
	}
	
	public StringSource getSecurityByToken(String token){
        StringSource result = new StringSource(
        		
//        	<wsse:Security xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">
//        		<wsse:BinarySecurityToken EncodingType="wsse:Base64Binary" ValueType="esquema" wsu:Id="SSOToken" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">QjQ2NTJDMURGRTI3M0MwMjVDRUUzOTFDIzE4MC4xMDEuMTE2LjkjMTQ5MTkwNDU1MjE1MiNQRDk0Yld3Z2RtVnljMmx2YmowaU1TNHdJaUJsYm1OdlpHbHVaejBpU1ZOUExUZzROVGt0TVNJL1BqeDBiMnRsYmtSbFptbHVhWFJwYjI0K1BHNWhiV1UrVUdWa2NtOU5ZWEowYVc1elBDOXVZVzFsUGp4aGJHbGhjejV1TnpBd01EazhMMkZzYVdGelBqeDFjMlZ5U1VRK2JqY3dNREE1UEM5MWMyVnlTVVErUEM5MGIydGxia1JsWm1sdWFYUnBiMjQrI0RFU2VkZS9DQkMvUEtDUzVQYWRkaW5nI3YxI0ludHJhU0NCQWxlbWFuaWEjTk9UIFVTRUQjU0hBMXdpdGhSU0EjcnFkVzF0ZzlhZDJHeTg1WTMrUnVkKytidDc4bU1YaEM1cjF4Ny9LMUE3ZkFlMFdHK0pWaXdhZFVoLzFCTUtnaHgzS2dMNUtuTDJaY2N3OC9HU2JtcGJDWnVXV2hwN2hqaExGcW1oNEg5a0czM3Y3Ynh5YkN4a1cyR2c0NGh4T2Z3NVI1by9HOWZDQVdxQUtzTUg1ZVQrVkxvUVZMa3cyb2ZLMU5hR2hUQkNNPQ==</wsse:BinarySecurityToken>
//        	</wsse:Security>

//        	"<wsse:Security xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n"+
//				"<wsse:BinarySecurityToken EncodingType=\"wsse:Base64Binary\" ValueType=\"esquema\" wsu:Id=\"SSOToken\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">"+token+"</wsse:BinarySecurityToken>\n"+
//        	"</wsse:Security>\n" );
        		"<wsse:Security SOAP-ENV:actor=\"http://www.isban.es/soap/actor/wssecurityUserPass\" SOAP-ENV:mustUnderstand=\"1\" S12:role=\"wsssecurity\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:S12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+
				"<wsse:BinarySecurityToken EncodingType=\"wsse:Base64Binary\" ValueType=\"esquema\" wsu:Id=\"SSOToken\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">"+token+"</wsse:BinarySecurityToken>\n"+
        		"</wsse:Security>\n" );

        		
        return result;
		
	}
}

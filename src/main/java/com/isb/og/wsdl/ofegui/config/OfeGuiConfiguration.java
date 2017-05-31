package com.isb.og.wsdl.ofegui.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
@PropertySource("classpath:soap.properties")
public class OfeGuiConfiguration {
	
	@Value("${soap.config.path.ofegui.path}")
	private String PATH;
	
	@Value("${soap.config.path.ofegui.uri}")
	private String URI;
	
	private static final String ofeguiWsClientName = "ofeguiWSmarshaller";

	@Bean(ofeguiWsClientName)
	public Jaxb2Marshaller ofeguiWSmarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in pom.xml
		marshaller.setContextPath(PATH);
		return marshaller;
	}
	
	@Bean
	public OfeGuiClient ofeguiWSClient(@Qualifier(ofeguiWsClientName)Jaxb2Marshaller marshaller) {
		OfeGuiClient client = new OfeGuiClient();
		client.setDefaultUri(URI);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}

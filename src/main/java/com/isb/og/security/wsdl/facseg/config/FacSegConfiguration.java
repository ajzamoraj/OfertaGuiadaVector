package com.isb.og.security.wsdl.facseg.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
@PropertySource("classpath:soap.properties")
public class FacSegConfiguration {
	
	@Value("${soap.config.path.facseg.path}")
	private String PATH;
	
	@Value("${soap.config.path.facseg.uri}")
	private String URI;
	
	private static final String facsegWsClientName = "facsegWSmarshaller";

	@Bean(facsegWsClientName)
	public Jaxb2Marshaller facsegWSmarshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage> specified in pom.xml
		marshaller.setContextPath(PATH);
		return marshaller;
	}
	
	@Bean
	public FacSegClient facsegWSClient(@Qualifier(facsegWsClientName)Jaxb2Marshaller marshaller) {
		FacSegClient client = new FacSegClient();
		client.setDefaultUri(URI);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
}

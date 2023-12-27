package com.javaExpress.autoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageWritter {
	@Autowired
////	@Qualifier("html")
//	@Qualifier("test")
	private IMessageproducer iMessageproducer;
	
	public void writeMessage(String message) {
		System.out.println(iMessageproducer.formatMessage("how are you satish"));
	}
}

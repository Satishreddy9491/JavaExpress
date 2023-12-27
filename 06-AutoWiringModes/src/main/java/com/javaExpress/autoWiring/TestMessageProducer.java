package com.javaExpress.autoWiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("test")

public class TestMessageProducer implements IMessageproducer {

	@Override
	public String formatMessage(String input) {
		
		return "Test message producers "+input;
	}

}

package com.javaExpress.autoWiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("html")
@Primary
public class HtmlMessageProducer implements IMessageproducer{

	@Override
	public String formatMessage(String input) {
		return "<html>"+input+"</html";
	}

}

package com.javaExpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.javaExpress.autoWiring.MessageWritter;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		MessageWritter message = context.getBean(MessageWritter.class);
		message.writeMessage("How are you all");
		
		
	}

}

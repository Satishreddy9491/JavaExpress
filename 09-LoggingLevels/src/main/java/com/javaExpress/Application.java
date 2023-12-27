package com.javaExpress;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//	private static final Logger log=LoggerFactory.getLogger(Application.class)
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
//		log.info("info log is enabled");
//		log.debug("debug is enabled");
//		log.error("error log is enabled");
		
		Employee emp=new Employee(); // NoargsConstrctor
		emp.setId("1");
		emp.setName("Satish");
		System.out.println(emp.getId()+" "+emp.getName());
		
		
		Employee emp1=new Employee("1","Reddy");
		System.out.println(emp1.getId()+" "+emp1.getName());
		
	}

}

package com.javaExpress;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunImpl implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("args.getOptionNames "+args.getOptionNames());
		System.out.println("args.containsOption "+args.containsOption("first-argument"));
		System.out.println("args.containsOption "+args.containsOption("dummy-argument"));
		System.out.println("args.getOptionValues "+args.getOptionValues("first-arguments"));
		System.out.println("args.getNonOptionArgs "+args.getNonOptionArgs());
	}

}

package com.javaExpress;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		List<String> collect = Arrays.stream(args).collect(Collectors.toList());
		System.out.println("Arguments "+collect);
	}

}

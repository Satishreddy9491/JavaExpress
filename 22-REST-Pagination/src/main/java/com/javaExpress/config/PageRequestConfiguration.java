package com.javaExpress.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@Configuration
public class PageRequestConfiguration {
	
	@Bean
	public PageRequest pageRequest(@Value("${products.records.pageSize}") Integer size) {
		return  PageRequest.of(0, size, Sort.by("price").ascending());
	}
}

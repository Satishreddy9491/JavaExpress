package com.javaExpress.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeHttpRequests().antMatchers("/search", "/register").permitAll().antMatchers("/reports")
				.hasAuthority("ADMIN").antMatchers("/profile").authenticated()
				.antMatchers(HttpMethod.GET, "/product/api/**").authenticated()
				.antMatchers(HttpMethod.POST, "/categeroy/**").hasAuthority("VENDOR")
				.antMatchers(HttpMethod.DELETE, "/product/api/**", "/categeroy/**").hasAuthority("ADMIN").and()
				.httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(getPasswordEncoder()).withUser("venkata")
				.password("$2a$12$ycs41sMke0OjMXHXMrV0Z.dRUbGK2jGpjFeDJx1qZroUWA6YNjDOu").authorities("USER");
		auth.inMemoryAuthentication().withUser("satish")
				.password("$2a$12$JXOMlsCievuUYmId328xmub6q8a5eVJ.WFcpmuWoOn8l6YYzoV952").authorities("ADMIN");
		auth.inMemoryAuthentication().withUser("sidd")
				.password("$2a$12$7lk9UlxFd9fApyYyXrDeHeKZbjXi5rsH7LFsN0nsryFvp/8s5b8n2").authorities("VENDOR");
	}
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}

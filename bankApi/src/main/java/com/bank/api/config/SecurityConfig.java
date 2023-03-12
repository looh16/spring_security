package com.bank.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests()
		.requestMatchers("/account","/balance","/cards","/loans").authenticated()
		.requestMatchers("/contacts","/notices").permitAll()
		.and()
		.formLogin()
		.and()
		.httpBasic();
		
		return http.build();
	}
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService() {
		
		UserDetails admin = User.withDefaultPasswordEncoder()
				.username("admin")
				.password("123456")
				.authorities("admin")
				.build();
		
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("user")
				.password("123456")
				.authorities("read")
				.build();
		return new InMemoryUserDetailsManager(admin, user);
	}

}

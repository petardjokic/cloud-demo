package com.cinematorium.cinemaservice.beans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Beans {

	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplatemplate() {
		return new RestTemplate();
	}
}

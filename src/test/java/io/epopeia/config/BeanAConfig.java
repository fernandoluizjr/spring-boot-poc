package io.epopeia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.epopeia.beans.A;

@Configuration
public class BeanAConfig {

	@Bean
	public A a() {
		return new A();
	}
}

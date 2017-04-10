package io.epopeia.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import io.epopeia.beans.B;

@RunWith(SpringRunner.class)
@ContextConfiguration // defaults to find configs inside this class
public class JunitWithSpringContextNestedConfigured {

	@Configuration // also you can define configuration as nested class
	static class BeanBConfig {

		@Bean
		public B b() {
			return new B();
		}
	}

	@Autowired
	public B b;

	@Test
	public void beansMustBeConfiguredAndInjected() {
		assertNotNull(b);
	}
}

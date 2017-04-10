package io.epopeia.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import io.epopeia.beans.A;
import io.epopeia.config.BeanAConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BeanAConfig.class) // specify beans to be loaded
public class JunitWithSpringContextConfigured {

	@Autowired
	public A a;

	@Test
	public void beansMustBeConfiguredAndInjected() {
		assertNotNull(a);
	}
}

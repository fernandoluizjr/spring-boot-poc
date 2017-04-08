package io.epopeia.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

@RunWith(MockitoJUnitRunner.class) // a different runner from some framework
public class JunitWithMockitoPlusSpringContext {

	@ClassRule // class and method rules do the same job as the spring runner
	public static final SpringClassRule SPRING_CLASS_RULE = new SpringClassRule();

	@Rule // class and method rules do the same job as the spring runner
	public final SpringMethodRule springMethodRule = new SpringMethodRule();

	@Autowired
	public ApplicationContext springContext;

	@Test
	public void springMustBeLoaded() {
		assertNotNull(springContext);
	}
}

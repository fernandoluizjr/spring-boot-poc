package io.epopeia.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration
@ActiveProfiles({ "dev", "stage" })
public class JunitWithSpringContextWithProfile {

	@Autowired
	public ApplicationContext springContext;

	@Test
	public final void testHome() {
		assertNotNull(springContext);
		assertEquals(springContext.getEnvironment().getActiveProfiles().length, 2);
	}
}

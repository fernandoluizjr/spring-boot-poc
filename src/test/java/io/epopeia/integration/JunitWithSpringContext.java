package io.epopeia.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class) // the spring runner
@ContextConfiguration // set how to load the container (default here)
@WebAppConfiguration // also set this container as a web container
public class JunitWithSpringContext {

	@Autowired // runner loads the context and caches it
	public ApplicationContext springContext;

	@Test
	public void springMustBeLoadedAndCached() {
		assertNotNull(springContext);
	}

	@DirtiesContext(methodMode = MethodMode.BEFORE_METHOD)
	@Test // this will not get the context from the cache
	public void runnerMustReloadTheContextBeforeThisTest() {
		assertNotNull(springContext);
	}
}

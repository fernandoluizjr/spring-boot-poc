package io.epopeia.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class) // the spring runner
@ContextConfiguration // set how to load the container (default here)
@WebAppConfiguration // also set this container as a web container
public class JunitWithSpringContext {

	@Autowired // runner loads the web context and caches it
	public WebApplicationContext springWebContext;

	@Test
	public void springMustBeLoadedAndCached() {
		assertNotNull(springWebContext);
	}

	@DirtiesContext(methodMode = MethodMode.BEFORE_METHOD)
	@Test // this will not get the context from the cache
	public void runnerMustReloadTheContextBeforeThisTest() {
		assertNotNull(springWebContext);
	}
}

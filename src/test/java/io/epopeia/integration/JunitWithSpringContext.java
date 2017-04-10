package io.epopeia.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.MethodMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.ServletWebRequest;

@RunWith(SpringRunner.class) // the spring runner
@ContextConfiguration // set how to load the container (config beans)
@WebAppConfiguration // also set this container with a MockServletContext
						// default resources are set to "file:src/main/webapp"
public class JunitWithSpringContext {

	@Autowired
	public WebApplicationContext springWebContext; // cached

	@Autowired
	public MockServletContext servletContext; // cached

	@Autowired
	public MockHttpSession session;

	@Autowired
	public MockHttpServletRequest request;

	@Autowired
	public MockHttpServletResponse response;

	@Autowired
	public ServletWebRequest webRequest;

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

package io.epopeia.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.ServletWebRequest;

@RunWith(SpringRunner.class) // the spring runner
// Instead of @ContextConfiguration and @WebAppConfiguration
// spring boot provides @SpringBootTest to set up the container
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
public class JunitWithSpringBoot {

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
}

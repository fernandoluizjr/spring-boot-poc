package io.epopeia.unit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.env.MockEnvironment;
import org.springframework.mock.env.MockPropertySource;

@RunWith(JUnit4.class) // explicitly runner for jUnit4
public class JunitOnlyWithSpringSupportClasses {

	@Autowired // it will not work because spring is not loaded
	public ApplicationContext springContext;

	// create some mocks using the spring support classes
	private MockEnvironment mockEnv = new MockEnvironment();

	private MockPropertySource mockPropSrc = new MockPropertySource();

	@Test
	public void springContextMustNotBeLoaded() {
		assertNull(springContext);
		assertNotNull(mockEnv);
		assertNotNull(mockPropSrc);
	}
}

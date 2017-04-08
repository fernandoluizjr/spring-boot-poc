package io.epopeia.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.mock.env.MockEnvironment;

import io.epopeia.web.EnvironmentController;

public class EnvironmentTest {

	private EnvironmentController environmentController;

	@Before
	public void createEnvController() {
		MockEnvironment mockEnv = new MockEnvironment().withProperty("profile.property", "value for profile.property");
		environmentController = new EnvironmentController(mockEnv, "value for value.injected");
	}

	@Test
	public final void testContainerEnvironment() {
		String ret = environmentController.containerEnvironment();
		assertNotNull(ret);
	}

	@Test
	public final void testProfileProperty() {
		String ret = environmentController.profileProperty();
		assertNotNull(ret);
		assertEquals(ret, "value for profile.property");
	}

	@Test
	public final void testValueInjected() {
		String ret = environmentController.valueInjected();
		assertNotNull(ret);
		assertEquals(ret, "value for value.injected");
	}

	@After
	public void destroyController() {
		environmentController = null;
	}
}

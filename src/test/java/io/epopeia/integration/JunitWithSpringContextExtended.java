package io.epopeia.integration;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;

import io.epopeia.BaseTest;

// note that we don't need RunWith anymore
@ContextConfiguration // specify child config beyond BaseTest
public class JunitWithSpringContextExtended extends BaseTest {

	@Test
	public void testExtended() {

	}
}

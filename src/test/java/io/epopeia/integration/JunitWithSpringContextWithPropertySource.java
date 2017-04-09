package io.epopeia.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration
@TestPropertySource("/test.properties") // or also inline as below:
// @TestPropertySource(properties = { "timezone = GMT", "port: 4242" })
public class JunitWithSpringContextWithPropertySource {

	@Value("${property.only.defined.in.test}")
	public String propertyValue;

	@Test
	public final void mustLoadAPropertyFromASource() {
		assertNotNull(propertyValue);
		assertEquals(propertyValue, "some value");
	}
}

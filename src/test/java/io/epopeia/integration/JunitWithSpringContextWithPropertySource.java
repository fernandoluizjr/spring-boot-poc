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
@ContextConfiguration // properties from @Configuration classes is also loaded
						// but Test properties has higher precedence overriding
@TestPropertySource( // defaults to <class name>.properties if omitted
locations = "/test.properties", properties = { "timezone = GMT", "port: 4242" })
public class JunitWithSpringContextWithPropertySource {

	@Value("${property.only.defined.in.test}")
	public String propertyValue;

	@Test
	public final void mustLoadAPropertyFromASource() {
		assertNotNull(propertyValue);
		assertEquals(propertyValue, "some value");
	}
}

package io.epopeia;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration // define all shared configs for children classes
public class BaseTest {
	// this class has the base configuration for all extended classes
}

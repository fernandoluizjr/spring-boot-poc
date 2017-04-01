package io.epopeia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @Configuration (the primary one)
// @EnableAutoConfiguration (use exclude to disable auto-configuration classes)
// @ComponentScan (from this base package)
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

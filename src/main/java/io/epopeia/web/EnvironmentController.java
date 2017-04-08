package io.epopeia.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

	private final Environment containerEnvironment;
	private final String value;

	public EnvironmentController(final Environment containerEnvironment,
			@Value("${value.injected}") final String value) {
		this.containerEnvironment = containerEnvironment;
		this.value = value;
	}

	@RequestMapping("/environment")
	public String containerEnvironment() {
		return containerEnvironment.toString();
	}
	
	@RequestMapping("/profile-property")
	public String profileProperty() {
		return containerEnvironment.getProperty("profile.property");
	}
	
	@RequestMapping("/value-injected")
	public String valueInjected() {
		return this.value;
	}
}

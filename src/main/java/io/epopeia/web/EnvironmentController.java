package io.epopeia.web;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

	private final Environment containerEnvironment;

	public EnvironmentController(final Environment containerEnvironment) {
		this.containerEnvironment = containerEnvironment;
	}

	@RequestMapping("/environment")
	public String containerEnvironment() {
		return containerEnvironment.toString();
	}
}

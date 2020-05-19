package cta.accenture.com.graph.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping
	public String home() {
		return "Application is up and running " + new Date();
	}

}

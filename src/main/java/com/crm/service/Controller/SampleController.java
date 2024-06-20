package com.crm.service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

	@GetMapping("/greet")
	public String getGreeting() {
		return "Hello, this is a sample GET API for Swagger documentation.";
	}
}

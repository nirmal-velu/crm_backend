package com.crm.service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.service.Entity.Register;
import com.crm.service.Response.ApiResponse;
import com.crm.service.servicelayer.RegisterService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/register")
public class RegisterController {

	private final RegisterService registerService;

	@Autowired
	public RegisterController(RegisterService registerService) {
		this.registerService = registerService;
	}

	@PostMapping("/register")
	public ResponseEntity<ApiResponse> registerUser(@RequestBody Register register) {
		ApiResponse response = registerService.registerUser(register);
		return new ResponseEntity<>(response, HttpStatus.valueOf(response.getStatusCode()));
	}
}

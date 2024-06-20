package com.crm.service.servicelayer;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.service.Entity.Login;
import com.crm.service.Entity.Register;
import com.crm.service.Repository.LoginRepository;
import com.crm.service.Repository.RegisterRepository;
import com.crm.service.Response.ApiResponse;

@Service
public class RegisterService {

	private final RegisterRepository registerRepository;
	private final LoginRepository loginRepository;

	@Autowired
	public RegisterService(RegisterRepository registerRepository, LoginRepository loginRepository) {
		this.registerRepository = registerRepository;
		this.loginRepository = loginRepository;
	}

	@Transactional
	public ApiResponse registerUser(Register register) {
		System.out.println("Register data: " + register);
		System.out.println("  login.setCreatedBy--->" + register.getEmail());

		if (!register.getPassword().equals(register.getConfirmPassword())) {
			return new ApiResponse(HttpStatus.BAD_REQUEST.value(), "Password doesn't match");
		}

		register.setCreatedOn(LocalDateTime.now());
		Register savedRegister = registerRepository.save(register);
//		Register savedRegister = registerRepository.save(register);

		if (savedRegister != null) {
			Login login = new Login();
			// Copy relevant details from savedRegister to login
			login.setCreatedBy(savedRegister.getCreatedBy());
			login.setCreatedOn(savedRegister.getCreatedOn());
			login.setPassword(savedRegister.getPassword());
			// Copy other fields as needed

			loginRepository.save(login);

			return new ApiResponse(HttpStatus.OK.value(), "User registered successfully");
		} else {
			return new ApiResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "User registration failed");
		}
	}
}

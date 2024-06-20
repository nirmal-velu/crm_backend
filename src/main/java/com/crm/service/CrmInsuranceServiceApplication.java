package com.crm.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EntityScan("com.crm.service")
public class CrmInsuranceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmInsuranceServiceApplication.class, args);
	}

}

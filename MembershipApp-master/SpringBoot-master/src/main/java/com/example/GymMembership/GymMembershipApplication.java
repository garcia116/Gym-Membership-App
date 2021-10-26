package com.example.GymMembership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class GymMembershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymMembershipApplication.class, args);
	}

}

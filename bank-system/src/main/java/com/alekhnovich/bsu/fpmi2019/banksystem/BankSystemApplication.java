package com.alekhnovich.bsu.fpmi2019.banksystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BankSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankSystemApplication.class, args);
	}

}

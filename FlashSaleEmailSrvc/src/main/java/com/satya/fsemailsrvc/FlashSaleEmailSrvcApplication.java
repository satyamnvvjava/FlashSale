package com.satya.fsemailsrvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.satya.fsemailsrvc.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class FlashSaleEmailSrvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlashSaleEmailSrvcApplication.class, args);
	}

}

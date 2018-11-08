package com.sample.manageclaim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sample")
public class ManageclaimApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageclaimApplication.class, args);
	}
}

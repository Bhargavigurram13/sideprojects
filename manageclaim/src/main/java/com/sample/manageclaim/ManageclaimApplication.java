package com.sample.manageclaim;

import com.sample.manageclaim.api.dao.UserJdbcRepository;
import com.sample.manageclaim.api.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.sample.manageclaim")
@EnableJpaRepositories(basePackages = {"com.sample.manageclaim.api.vo", "com.sample.manageclaim.api.dao"})
public class ManageclaimApplication {

	public static void main(String[] args) {

	    SpringApplication.run(ManageclaimApplication.class, args);

	}
}

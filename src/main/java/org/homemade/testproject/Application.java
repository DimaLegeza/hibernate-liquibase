package org.homemade.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "org.homemade.testproject")
@EnableJpaRepositories(basePackages = "org.homemade.testproject.repository")
@EnableWebMvc
public class Application {
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

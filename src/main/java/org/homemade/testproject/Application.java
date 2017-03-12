package org.homemade.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "org.homemade.testproject")
@EnableJpaRepositories(basePackages = "org.homemade.testproject.repository")
@EnableWebMvc
@EnableSwagger2
public class Application {
	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

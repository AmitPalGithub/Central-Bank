package com.futuretech.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*
	Use this annotation to scans the other files if we do not write the files under the main package
	use the pacakage name according to yur application
	@ComponentScans({ @ComponentScan("com.easybytes.controller") })
	@EnableJpaRepositories("com.easybytes.repository")
	@EntityScans("com.easybytes.accounts.entity")
 */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Central Bank Accounts microservice REST API Documentation",
				version ="v1",
				contact = @Contact(
						name = "Amit Pal",
						email = "myteam@gmail.com",
						url = "https://techfuture.com"
				),
				license = @License(
						name = "Apache 10.0",
						url = "https://techfuture.com"
				)
		),
		externalDocs =@ExternalDocumentation(
				description = "Central-Bank Accounts microservice REST API Documentation",
				url = "https://localhost:8080/swagger-ui/index.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AccountsApplication.class, args);
	}

}

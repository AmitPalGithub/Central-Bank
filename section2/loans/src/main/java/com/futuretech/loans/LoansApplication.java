package com.futuretech.loans;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.futuretech.loans.controller") })
@EnableJpaRepositories("com.futuretech.loans.repository")
@EntityScan("com.futuretech.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "Central Bank Accounts microservice REST API Documentation",
				version ="v1",
				contact = @Contact(
						name = "Amit Pal",
						email = "futuretech@gmail.com",
						url = "https://techfuture.com"
				),
				license = @License(
						name = "Apache 10.0",
						url = "https://futuretech.com"
				)
		),
		externalDocs =@ExternalDocumentation(
				description = "Central-Bank Loans microservice REST API Documentation",
				url = "https://localhost:8090/swagger-ui/index.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}

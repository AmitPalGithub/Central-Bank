package com.futuretech.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.cards.controller") })
@EnableJpaRepositories("com.eazybytes.cards.repository")
@EntityScan("com.eazybytes.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Central Bank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Amit Pal",
						email = "futuretech@gmail.com",
						url = "https://www.futuretech.com"
				),
				license = @License(
						name = "Apache 10.0",
						url = "https://www.futuretech.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Central Bank Cards microservice REST API Documentation",
				url = "https://www.futuretech.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {

		SpringApplication.run(CardsApplication.class, args);
	}

}

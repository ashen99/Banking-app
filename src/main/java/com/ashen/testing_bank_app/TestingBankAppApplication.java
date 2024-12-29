package com.ashen.testing_bank_app;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "The Sampling Bank App with java and springboot",
				description = "Backend Rest API for the banking application",
				version = "v1.0",
				contact = @Contact(
						name = "Ashen Perera",
						email = "ashaneperera1999@gmail.com"
				),
				license = @License(
						name = "Ashen Perera",
						url = "https://github.com/ashen99"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "The Bank App documentation",
				url = "https://github.com/ashen99"
		)
)
public class TestingBankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingBankAppApplication.class, args);
	}

}

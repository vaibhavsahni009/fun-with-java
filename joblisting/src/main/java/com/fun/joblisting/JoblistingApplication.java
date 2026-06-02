package com.fun.joblisting;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JoblistingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}

	@Bean
	public OpenAPI jobListingOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Job Listing API")
						.description("REST API for managing job listings")
						.version("1.0.0"));
	}

}

package com.reymar.event_api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info = @Info(
				contact = @Contact(
						name = "Omar",
						email = "omar_mendoza@epam.com",
						url = "https://github.com/reymarmendoza/event-levelup"
				),
				description = "",
				title = "",
				version = "1.0",
				license = @License(
						name = "LevelUp Module 9 (Events)",
						url = ""
				),
				termsOfService = "Service"
		),
		servers = @Server(
				description = "Local",
				url = "http://localhost:9090/"
		)
)
public class OpenApiConfig {
}

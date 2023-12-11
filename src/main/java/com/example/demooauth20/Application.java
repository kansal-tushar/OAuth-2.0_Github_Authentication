package com.example.demooauth20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * AS soon as you include spring-boot-starter-oauth2-client dependendency in your pom.xml,
	 * it has an API in its codebase which has the path /oauth2/authorization/:registrationId
	 */

}

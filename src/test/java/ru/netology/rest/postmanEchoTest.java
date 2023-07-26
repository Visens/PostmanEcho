package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class postmanEchoTest {

	@Test
	void shouldReturnEchoTest() {
		given()
				.baseUri("https://postman-echo.com")
				.body("Say Hello!")
				.when()
				.post("/post")
				.then()
				.statusCode(200)
				.body("data", equalTo("Say Hello!"));
	}
}

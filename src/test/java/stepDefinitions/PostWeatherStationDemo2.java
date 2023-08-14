package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class PostWeatherStationDemo2 {
	private Response response;

	@Given("Call a Post Method URL with API Key")
	public void call_a_post_method_url_with_api_key() {
		RestAssured.baseURI = "http://api.openweathermap.org";
	}
	
	@When("the Header and Body Request Parameters are specified")
	public void the_header_and_body_request_parameters_are_specified() {
		response = given()
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"external_id\": \"DEMO_TEST002\",\r\n"
				+ "\"name\": \"Team Demo Test Station 002\",\r\n"
				+ "\"latitude\": 44.44,\r\n"
				+ "\"longitude\": -122.44,\r\n"
				+ "\"altitude\": 111\r\n"
				+ "}")
		.when().post("data/3.0/stations?appid=2c75a9a3c4ca1a35e1fa04cccc90ac60");
	}
	
	@Then("validate the HTTP Response status code")
	public void validate_the_http_response_status_code() {
		
	response.then().log().all().assertThat().statusCode(201);
	}

}

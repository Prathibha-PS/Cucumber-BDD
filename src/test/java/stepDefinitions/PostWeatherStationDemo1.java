package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class PostWeatherStationDemo1 {
	private Response response;

	@Given("Call Post Method Base URL with API Key")
	public void call_post_method_base_url_with_api_key() {
		RestAssured.baseURI = "http://api.openweathermap.org";
	}
	
	@When("the Header and Body Request Parameters is specified")
	public void the_header_and_body_request_parameters_is_specified() {
		response = given()
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"external_id\": \"DEMO_TEST001\",\r\n"
				+ "\"name\": \"Team Demo Test Station 001\",\r\n"
				+ "\"latitude\": 33.33,\r\n"
				+ "\"longitude\": -122.43,\r\n"
				+ "\"altitude\": 222\r\n"
				+ "}")
		.when().post("data/3.0/stations?appid=2c75a9a3c4ca1a35e1fa04cccc90ac60");
	}
	
	@Then("validate HTTP Response status code")
	public void validate_http_response_status_code() {

		response.then().log().all().assertThat().statusCode(201);
	}

}

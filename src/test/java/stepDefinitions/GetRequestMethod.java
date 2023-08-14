package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

public class GetRequestMethod {
	
	@Given("Send a Get Request URL with API Key")
	public void send_a_get_request_url_with_api_key() {
		RestAssured.baseURI = "http://api.openweathermap.org";
	}
	
	
	@Then("validate the list of stations with HTTP Response success status code")
	public void validate_the_list_of_stations_with_http_response_success_status_code() {
		RestAssured.given()
		.when().
		get("data/3.0/stations?appid=2c75a9a3c4ca1a35e1fa04cccc90ac60").
		then().log().all().assertThat().statusCode(200);
	}
	


}

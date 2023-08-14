package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class PostReqWOKey {
	private Response response;
	
	@Given("Call a Post Method Request Base URL without Key")
	public void call_a_post_method_request_base_url_without_key() {
	    
		RestAssured.baseURI = "http://api.openweathermap.org";
	}
	
	@When("Header and Body Request Parameters are specified")
	public void header_and_body_request_parameters_are_specified() {
		response = given()
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "  \"external_id\": \"SF_TEST001\",\r\n"
				+ "  \"name\": \"San Francisco Test Station\",\r\n"
				+ "  \"latitude\": 37.76,\r\n"
				+ "  \"longitude\": -122.43,\r\n"
				+ "  \"altitude\": 150\r\n"
				+ "}")
		.when().post("data/3.0/stations");
	}
	

	@Then("validate the Response status code")
	public void validate_the_response_status_code() {
		
		response.then().log().all().assertThat().statusCode(401);
				
	}


}

package stepDefinitions;

import io.restassured.RestAssured;

public class SampleGet {
	
	public void getReq() {
		
		RestAssured.given().baseUri("http://api.openweathermap.org")
		.when().get("data/3.0/stations?appid=2c75a9a3c4ca1a35e1fa04cccc90ac60")
		//.then().log().all().assertThat().statusCode(401);
		.prettyPrint();
	}
	

}

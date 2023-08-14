package testbdd.testbddcucumber;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class api {

	public static void main(String[] args) {
		
		
		
		RestAssured.baseURI = "http://api.openweathermap.org";
		given().header("Content-Type", "application/json")
//				.body("{\r\n" + "  \"external_id\": \"SF_TEST001\",\r\n"
//						+ "  \"name\": \"San Francisco Test Station\",\r\n" + "  \"latitude\": 37.76,\r\n"
//						+ "  \"longitude\": -122.43,\r\n" + "  \"altitude\": 150\r\n" + "}")
				.body("{\r\n"
						+ "\"external_id\": \"DEMO_TEST001\",\r\n"
						+ "\"name\": \"Team Demo Test Station 001\",\r\n"
						+ "\"latitude\": 33.33,\r\n"
						+ "\"longitude\": -122.43,\r\n"
						+ "\"altitude\": 222\r\n"
						+ "}")
				//.when().post("data/3.0/stations").then().log().all().assertThat().statusCode(401);
				.when().post("data/3.0/stations?appid=2c75a9a3c4ca1a35e1fa04cccc90ac60").then().log().all().assertThat().statusCode(201);

	}

}

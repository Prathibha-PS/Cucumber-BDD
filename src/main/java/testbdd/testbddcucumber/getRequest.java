package testbdd.testbddcucumber;



import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getRequest {

	public static void main(String[] args) {
	
		//Response response = RestAssured.get("http://api.openweathermap.org/data/3.0/stations");
		Response response = RestAssured.get("http://api.openweathermap.org/data/3.0/stations?appid=2c75a9a3c4ca1a35e1fa04cccc90ac60");
		
		int statuscode = response.statusCode();
		String statusLine = response.statusLine();
		
		System.out.println(statuscode);
		System.out.println(statusLine);
		
	}

}

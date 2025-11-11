package apiTesting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class P01_BasicGET {
	public static void main(String[] args) {
		System.setProperty("java.net.useSystemProxies","true");

		RestAssured.useRelaxedHTTPSValidation();
		
		
		RestAssured.baseURI ="https://jsonplaceholder.typicode.com/";
		String resp = given()
		.header("Connection", "keep-alive")
		.when().get("/posts/1")
		.then().extract().response().asString();
		System.out.println(resp);
	}
}










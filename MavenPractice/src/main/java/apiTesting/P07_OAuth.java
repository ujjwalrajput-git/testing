package apiTesting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class P07_OAuth {
	public static void main(String[] args) {
		System.setProperty("java.net.useSystemProxies", "true");
        RestAssured.useRelaxedHTTPSValidation();
		
		RestAssured.baseURI = "https://api.github.com";
		given().auth()
		.oauth2("")
		.when().get("user/repos")
		.then().log().all();
	}
}

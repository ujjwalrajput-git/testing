package apiTesting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class P07_OAuth {
	public static void main(String[] args) {
		System.setProperty("java.net.useSystemProxies", "true");
        RestAssured.useRelaxedHTTPSValidation();
		
		RestAssured.baseURI = "https://api.github.com";
		given().auth()
		.oauth2("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")
		.when().get("user/repos")
		.then().log().all();
	}
}

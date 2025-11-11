package apiTesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.given;

public class P03_JSONPath {
	public static void main(String[] args) {
		
		System.setProperty("java.net.useSystemProxies", "true");
        RestAssured.useRelaxedHTTPSValidation();
        
		RestAssured.baseURI="https://fakestoreapi.com";
		String resp=given()
		.header("Connection","keep-alive")
		.when().get("/products/1")
		.then().extract().response().asString();
		System.out.println(resp);
		JsonPath js=new JsonPath(resp);
		System.out.println(js.getString("firstname"));

	}

}

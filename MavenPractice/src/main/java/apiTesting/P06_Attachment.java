package apiTesting;


import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.given;

import java.io.File;

public class P06_Attachment {
	public static void main(String[] args) {
		RestAssured.baseURI = "http://localhost:8080/";
		SessionFilter session = new SessionFilter();
		given()
		.header("Connection", "application/json")
		.body("{ \"username\": \"engineerdiariesunofficial\","+" \"password\": \"Priyanka@1\"}").filter(session)
		.when().post("rest/auth/1/session")
		.then();
		File obj = new File("");
		given()
		.pathParam("key", "MAR-2")
		.head("X-Atlasian-Token", "no-check")
		.multiPart("file", obj)
		.filter(session)
		.when().post("rest/api/2/issues/{key}/attachments")
		.then().log().all();
		
	}
}

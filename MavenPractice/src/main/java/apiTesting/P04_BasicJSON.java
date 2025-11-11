package apiTesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class P04_BasicJSON {
	public static void main(String[] args) {
		
		System.setProperty("java.net.useSystemProxies", "true");
        RestAssured.useRelaxedHTTPSValidation();
		
		RestAssured.baseURI = "https://fakestoreapi.com/";
		 
        String resp = RestAssured
                .given()
                .header("Connection", "keep-alive")
                .when()
                .get("products")
                .then()
                .extract()
                .response()
                .asString();
 
        JsonPath js = new JsonPath(resp);
        int size = js.getInt("title.size()");
 
        System.out.println("Total Products: " + size);
        System.out.println(js.getString("title[0]"));
 
        for (int i = 0; i < size; i++) {
            System.out.println(js.getString("title[" + i + "]"));
        }
	}

}


 

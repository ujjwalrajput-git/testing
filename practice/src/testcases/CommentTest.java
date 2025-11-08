package testcases;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class CommentTest {
	
	@Test
	void feedback() {
		try {
			int num = 10/0;
			System.out.println("FEDBACK");
		}
		catch(Exception ex) {
			
		}
	}
	
	@Test
	void likeBtn() {
		System.out.println("hello");
		SoftAssert soft = new SoftAssert();
		
		soft.assertTrue(true);
		
		System.out.println("bye");
		
		soft.assertAll();
	}
	
	@Parameters({"username", "pass"})
	@Test
	void methodParemeter(String username, String pass) {
		System.out.println("METHOD methodParameter : "+username+" "+pass);
	}
	
	@Test(dataProvider = "getData")
	void login(String username, String pass) {
		System.out.println("Method login : "+username+" "+pass);
	}
	
	@DataProvider
	Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "user1";
		data[0][1] = "user2";
		data[1][0] = "user3";
		data[1][1] = "user4";
		data[2][0] = "user5";
		data[2][1] = "user6";
		return data;
		
	}
	
	
}








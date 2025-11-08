package testcases;

import org.testng.annotations.*;

public class LoginTest {
	@Test
	void check() {
		System.out.println("i will pass");
	}
	
	@Test(enabled = false)
	void check2() {
		System.out.println("i will not run"); 
	}
	
	@Test(timeOut = 2000)
	void check3() throws InterruptedException {
		Thread.sleep(1999);
		System.out.println("i am timeout"); 
	}
	
	@Test
	void loginData() {
		int num = 10/0;
		System.out.println("Login Data");
	}
	
	@Test(dependsOnMethods = "loginData")
	void logoutData() {
		System.out.println("Log out Data");
	}
}

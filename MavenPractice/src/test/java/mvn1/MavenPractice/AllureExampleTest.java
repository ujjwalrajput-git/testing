package mvn1.MavenPractice;

import org.testng.Assert;
import org.testng.annotations.*;

import io.qameta.allure.*;

public class AllureExampleTest {
	@Test(priority = 1, description = "verifying login page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify login page title test on Login Page")
	@Story("Story Name: To check login page title")
	public void verifyLoginPageTitleTest() {
		System.out.println("the login page title is: " );
		Assert.assertTrue(true);
	}
}

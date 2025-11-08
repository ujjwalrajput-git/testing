package mvn1.MavenPractice;

import org.testng.annotations.*;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class PaymentTest {
	
	@Test(priority = 1, description = "verifying login page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify login page title test on Login Page")
	@Story("Story Name: To check login page title")
	void pay() {
		System.out.println("Payment Test\n1234\n");
	}
	

}

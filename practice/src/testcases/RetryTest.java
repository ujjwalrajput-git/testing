package testcases;

import org.testng.annotations.Test;

public class RetryTest {
	@Test(retryAnalyzer = Rerun.class)
	void login() throws InterruptedException {
		System.out.println("try");
		Thread.sleep(1000);
		int num = 10/0;
		
	}
}

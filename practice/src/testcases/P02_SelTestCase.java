package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P02_SelTestCase {
	@Test
	void MA() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
	}
	
	@Test
	void MC() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	void MB() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tpointtech.com/");
	}
}

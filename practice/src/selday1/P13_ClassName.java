package selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_ClassName {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.className("form-control")).sendKeys("coforge");
	}
}

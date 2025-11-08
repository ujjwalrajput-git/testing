package selday1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_LinkText {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Online Trainings")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Online")).click();
	}
}

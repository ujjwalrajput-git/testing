package selday1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_Forms {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement nameBox = driver.findElement(By.id("name"));
		Thread.sleep(3000);
		nameBox.sendKeys("coforge");
		Thread.sleep(3000);
		driver.findElement(By.id("male")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("saturday")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sunday")).click();
		Thread.sleep(3000);
		
	}
}

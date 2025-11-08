package selday1;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class P07_FindEle {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		List<WebElement> inputlist = driver.findElements(By.tagName("input"));
		for(WebElement input : inputlist) {
			input.sendKeys("hello");
		}
		
	}
}

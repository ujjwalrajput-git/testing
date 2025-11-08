package selday1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_GETMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(500);
		driver.manage().window().minimize();
		System.out.println(driver.getTitle());
		WebElement startBtn = driver.findElement(By.name("start"));
		System.out.println(startBtn.getAttribute("onclick"));
		System.out.println(startBtn.getAttribute("font-size"));
		System.out.println(startBtn.getTagName());
		System.out.println(startBtn.getText());
		System.out.println(startBtn.isDisplayed());
		System.out.println(startBtn.isEnabled());
		System.out.println(startBtn.isSelected());
		System.out.println(startBtn.getLocation().getX());
		System.out.println(startBtn.getLocation().getY());
		System.out.println(startBtn.getRect().getWidth());
		System.out.println(startBtn.getRect().getHeight());
	}
}

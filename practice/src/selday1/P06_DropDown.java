package selday1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class P06_DropDown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("sunday")).click();
		Thread.sleep(1000);
		WebElement country =  driver.findElement(By.id("country"));
		Thread.sleep(1000);
		Select selectCountry = new Select(country);
		Thread.sleep(1000);
		selectCountry.selectByIndex(3);
		Thread.sleep(1000);
		selectCountry.selectByValue("uk");
		Thread.sleep(1000);
		selectCountry.selectByContainsVisibleText("Japan");
		Thread.sleep(1000);
		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\Ujjwal.Rajput\\Downloads\\E-IDCard_00138298.PDF");
		
	}
}

package selday2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P06_KeyDown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act  = new Actions(driver);
		
		WebElement name = driver.findElement(By.id("name"));
		
		act.keyDown(Keys.SHIFT).build().perform();
		name.sendKeys("hello");
		act.keyUp(Keys.SHIFT).build().perform();
		name.sendKeys(" bye");
	}
}

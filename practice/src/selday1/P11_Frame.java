package selday1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_Frame {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		WebElement frameTag = driver.findElements(By.tagName("iframe")).get(2);
		driver.switchTo().frame(frameTag);
		WebElement nestedFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(nestedFrame);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		driver.findElements(By.tagName("input")).get(20).sendKeys("hello coforge");
	}
}

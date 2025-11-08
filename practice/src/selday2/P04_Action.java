package selday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P04_Action {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act  = new Actions(driver);
		
		WebElement hover = driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		act.scrollToElement(hover).build().perform();
		act.scrollByAmount(0, 100).build().perform();
		act.moveToElement(hover).build().perform();
		
		
	}
}

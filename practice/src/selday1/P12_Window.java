package selday1;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_Window {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
		Thread.sleep(500);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(parent);
		Thread.sleep(500);
		driver.switchTo().window(child);
		Thread.sleep(500);
		driver.close();
		Thread.sleep(500);
		driver.switchTo().window(parent);
		Thread.sleep(500);
		driver.close();
		
		
	}
}

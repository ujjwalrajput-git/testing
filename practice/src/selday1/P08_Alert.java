package selday1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_Alert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(500);
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(500);
		Alert alertWin = driver.switchTo().alert();
		Thread.sleep(500);
		System.out.println(alertWin.getText());
		Thread.sleep(500);
		alertWin.accept();
		Thread.sleep(500);
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(500);
		alertWin = driver.switchTo().alert();
		Thread.sleep(500);
		System.out.println(alertWin.getText());
		Thread.sleep(500);
		alertWin.dismiss();
		Thread.sleep(500);
		driver.findElement(By.id("promptBtn")).click();
		Thread.sleep(500);
		alertWin = driver.switchTo().alert();
		Thread.sleep(500);
		System.out.println(alertWin.getText());
		Thread.sleep(500);
		alertWin.sendKeys("coforge");
		Thread.sleep(500);
		alertWin.accept();
		Thread.sleep(500);
		
	}
}

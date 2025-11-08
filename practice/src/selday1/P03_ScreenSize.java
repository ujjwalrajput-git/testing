package selday1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;


public class P03_ScreenSize {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().setSize(new Dimension(300,900));
		Thread.sleep(3000);
		
		
		
	}

}

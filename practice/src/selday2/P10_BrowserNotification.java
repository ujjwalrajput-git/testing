package selday2;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class P10_BrowserNotification {
	public static void main(String[] args) {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notification",1);
		
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("prefs", prefs);
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("bom");
		//driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input")).sendKeys("maa");
		
	}
}

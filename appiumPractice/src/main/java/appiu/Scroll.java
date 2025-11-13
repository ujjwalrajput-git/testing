package appiu;

import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Scroll {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		service.start();
        UiAutomator2Options opt=new UiAutomator2Options();
        opt.setDeviceName("d1");
        opt.setApp("C:\\Users\\Ujjwal.Rajput\\eclipse-workspace\\appiumPractice\\src\\main\\java\\resources\\ApiDemos-debug.apk");
        
        
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),opt);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        Thread.sleep(2000);
        

       driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())."
        		+ "scrollIntoView(new UiSelector().text(\"Picker\"));"));
       
       System.out.println("Scrolled");
	}
}

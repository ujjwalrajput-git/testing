package appiu;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class LongPress {
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
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]"
       )).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
        	    "elementId", ((RemoteWebElement) element).getId()
        	));
        Thread.sleep(12000);
        System.out.println("Long pressed");
	}
}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class IEngage {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://iengage.coforge.com/ess2/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"ad-Credentials\"]")).click();
		
	}
}

package selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class P16_Google {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Coforge");
		driver.findElement(By.xpath("/html/body/div[2]/div[4]/form/div[1]/div[1]/div[3]/center/input[2]")).click();
		
		
	}
}

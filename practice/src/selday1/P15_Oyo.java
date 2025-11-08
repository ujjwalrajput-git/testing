package selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class P15_Oyo {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.oyorooms.com/?utm_source=google&utm_medium=cpc&utm_device=c&utm_campaign=India_SEM_Brand_generic&utm_campaignid=1701551904&utm_adgroup=143959616297&utm_content=751298002022&utm_keyword=oyo&gad_source=1&gad_campaignid=1701551904&gbraid=0AAAAADj-OgRDFGf8LleSKgGzBcovS2KWp&gclid=EAIaIQobChMI-MOw39HQkAMVPPU8Ah17PDH1EAAYASAAEgLGlvD_BwE");
		
		driver.manage().window().maximize();
		
		// open calender
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/div/span[1]")).click();
		
		//next next
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[4]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[4]/div")).click();
		
		// start and end
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[3]/table/tbody/tr[2]/td[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/span/div/div/div[3]/table/tbody/tr[2]/td[4]/span")).click();
		
		
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/div/span[1]")).sendKeys("03-02-2026");
		
		//driver.findElement(By.xpath(""));
		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div/div/div[2]/div/div/span[3]")).sendKeys("Thu, 5 Feb");
		
	}
}

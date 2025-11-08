package mvn1.MavenPractice;

import org.openqa.selenium.*;

public class FormPage {
	WebDriver driver;
	
	By nameInput = By.id("name");
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNameInput(WebDriver driver) {
		return driver.findElement(this.nameInput);
	}

}

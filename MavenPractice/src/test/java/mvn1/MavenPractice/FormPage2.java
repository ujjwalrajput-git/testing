package mvn1.MavenPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class FormPage2 {
	WebDriver driver;
	
	@FindBy(id = "name")
	WebElement userInput;
	
	public FormPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getUserInput() {
		return this.userInput;
	}
}

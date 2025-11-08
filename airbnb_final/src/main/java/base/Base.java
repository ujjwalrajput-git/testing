package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public static WebDriver driver;

    // Initialize WebDriver based on browser property
    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(
            "C:\\Users\\Ujjwal.Rajput\\eclipse-workspace\\airbnb_final\\src\\main\\java\\data.properties"
        );
        prop.load(fis);
        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        // Add other browser options if needed

        return driver;
    }

    // Get URL from properties file
    public String getUrl() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(
            "C:\\Users\\Ujjwal.Rajput\\eclipse-workspace\\airbnb_final\\src\\main\\java\\data.properties"
        );
        prop.load(fis);
        return prop.getProperty("browser_url");
    }

    // Take screenshot safely
    public void takeScreenshot(WebDriver driver, String path) {
        if (driver == null) {
            System.out.println("Driver is null. Cannot take screenshot.");
            return;
        }

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String destinationFile = System.getProperty("user.dir") + "\\screenshots\\" + path + ".png";
            FileUtils.copyFile(scrFile, new File(destinationFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
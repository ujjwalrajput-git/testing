package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fls = new FileInputStream("C:\\Users\\Ujjwal.Rajput\\eclipse-workspace\\practice\\src\\testcases\\Data.properties\\");
		prop.load(fls);
		System.out.println(prop.getProperty("url"));
		fls.close();
	}
}

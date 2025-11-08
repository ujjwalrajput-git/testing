package testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer{
	
	static int retry = 1;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(retry<=2) {
			System.out.println(" Attempt "+retry);
			retry++;
			return true;
		}
		else
			return false;
	}
	
}

package testcases;

import org.testng.annotations.Test;

public class PriorityClass {
	@Test(priority = 2)
	void meathodB() {
		System.out.println("meathod B");
	}
	
	@Test(priority = 0,groups="smoke")
	void meathodC() {
		System.out.println("meathod C");
	}
	
	@Test(priority = 1)
	void meathodA() {
		System.out.println("meathod A");
	}
}

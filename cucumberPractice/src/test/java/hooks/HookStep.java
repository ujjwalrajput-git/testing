package hooks;

import io.cucumber.java.*;

public class HookStep {
	@Before
	public void setup() {
		System.out.println("i will run 1 st");
	}
	
	@After
	public void tearDown() {
		System.out.println("i will run in the end");
	}
}

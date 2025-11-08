package selday1;

public class P02_ThreadSleep {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("one");
		Thread.sleep(1000);
		System.out.println("two");
		Thread.sleep(1000);
		System.out.println("three");
		Thread.sleep(1000);
		System.out.println("four");
		Thread.sleep(1000);
		System.out.println("five");
	}

}

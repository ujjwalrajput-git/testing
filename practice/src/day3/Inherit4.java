package day3;

class DataA{
	protected void hwllo() {
		System.out.println("Hello");
	}
}

class DataB extends DataA{
	public void hello() {
		System.out.println("Bye");
		
	}
	
}

public class Inherit4 {
	public static void main(String[] args) {
		DataB obj1 = new DataB();
		obj1.hello();
	}
}


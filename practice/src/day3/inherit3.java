package day3;

public class inherit3 {
	public static class UserA{
		void greet() {
			System.out.println("Hello");
		}
	}
	
	public static class UserB{
		void greet() {
			System.out.println("Bye");
		}
	}
	
	public static void main(String[] args) {
		UserA obj = new UserA();
		obj.greet();
	}

}

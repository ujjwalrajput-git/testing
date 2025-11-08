package selday1;

public class P20_Throws {
	
	static void checkAge(int age) throws Exception {
		if(age<18)
			throw new Exception("Underage");
	}
	
	public static void main(String[] args) {
		try {
			checkAge(16);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

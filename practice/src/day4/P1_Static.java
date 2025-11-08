package day4;

class Employee{
	
	String name;
	static String company;
	int eCode;
	
	static class Address{
		static String country;
		static String state;
	}
	
	static {
		System.out.println("Employee static called");
	}
	
	
}

public class P1_Static {
	
	static {
		System.out.println("P1 static called");
	}
	public static void main(String[] args) {
		
		Employee.company = "Coforge ltd";
		Employee.Address.country = "In";
		System.out.println(Employee.company+" "+Employee.Address.country);
		
	}
}

package javaTopics;

class Employee{
	static Employee obj;
	private Employee() {
		
	}
	static Employee getInstance() {
		if(obj == null)
			obj = new Employee();
		return obj;
	}
}

public class P07_singleton {
	public static void main(String[] args) {
		Employee obj1 = Employee.getInstance();
		Employee obj2 = Employee.getInstance();
		if(obj1 == obj2)
			System.out.println("same object");
	}
}

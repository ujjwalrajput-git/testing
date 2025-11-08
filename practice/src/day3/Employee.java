package day3;

public class Employee {
	int empID;
	String name;
	float salary;
	
	public Employee(int e) {
		empID = e;
	}
	void print() {
		System.out.println("hello : "+name+"\nE=Code : "+empID);
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(101);
		emp1.setName("Rohan");
		emp1.setSalary(25000);
		emp1.print();
		System.out.println("salary : "+emp1.getSalary());
	}
}
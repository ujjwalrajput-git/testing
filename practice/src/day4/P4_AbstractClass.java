package day4;

abstract class Student
{
	void hello()
	{
		
	}
	abstract void bye();
}

class StudentA extends Student
{
	void bye()
	{
		System.out.println("bye");
	}
}

public class P4_AbstractClass {
	public static void main(String[] args) 
	{
		StudentA obj = new StudentA();
		obj.bye();
	}

}

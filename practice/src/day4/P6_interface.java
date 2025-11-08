package day4;

interface ITest
{
	int num1 = 10;
	
	public static int num2 = 20;
	void sum();
	public abstract void sub();
	static void hello()
	{
		System.out.println("hello");
	}	
}

class Child implements ITest
{
	public void sum() 
	{
		
	}
	public void sub() 
	{
		
	}
	
}

public class P6_interface {
	public static void main(String[] args) {
		
	}
}

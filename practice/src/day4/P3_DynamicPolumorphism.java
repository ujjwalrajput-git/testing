package day4;

class TestA
{
	static void print()
	{
		System.out.println("hello");
	}
}

class TestB extends TestA
{
	static void print()
	{
		System.out.println("bye");
	}
}

public class P3_DynamicPolumorphism 
{
	public static void main(String[] args) 
	{
		TestA obj = new TestB();
		obj.print();
	}
}

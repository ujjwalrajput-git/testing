package day4;

interface Parent1
{
	int num = 10;
	void print();
}

interface Parent2
{
	int num = 10;
	void print();
}

class User implements Parent1,Parent2
{
	public void print()
	{
		System.out.println(Parent1.num);
	}
}

public class P7_MultipleInheritance {
	public static void main(String[] args) {
		User obj = new User();
		obj.print();
	}
}

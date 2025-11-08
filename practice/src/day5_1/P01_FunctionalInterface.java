package day5_1;

interface ITest{
	int sum(int num1, int num2);
	//int sub(); // only can have 1 abstract function in functional interface 
}

public class P01_FunctionalInterface {
	public static void main(String[] args) {
		ITest obj = (a,b)->{
			return a + b;
		};
		System.out.println(obj.sum(10, 20));
	}
}

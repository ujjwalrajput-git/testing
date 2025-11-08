package day3;

public class ObjectClass {
	static Object returnData(Object obj) {
		return obj;
	}
	public static void main(String[] args) {
		Object o1 = returnData("hello");
		System.out.println(o1);
		
		Object o2 = returnData(123);
		System.out.println(o2);
		
		Object o3 = returnData(45.24);
		System.out.println(o3);
	}
}

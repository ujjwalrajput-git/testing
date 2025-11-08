package day3;

public class PolySum {
	static int sum(int a, int b) {
		return a + b;
	}
	static int sum(int a, int b, int c) {
		return a + b + c;
	}
	static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30, d = 40;
		System.out.println(sum(a, c, d, b));
		System.out.println(sum(a, c, d));
		System.out.println(sum(a, c));
	}

}

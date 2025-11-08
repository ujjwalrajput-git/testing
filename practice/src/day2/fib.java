package day2;

public class fib {
	public static void main(String args[] ) {
		System.out.println("Fibonacci series");
		
		int n = 8, n1 = 0, n2 = 1;
		System.out.print(n1+" "+n2+" ");
		for(int i = 0; i < n;i++) {
			int t = n1 + n2;
			System.out.print(t+" ");
			n1 = n2;
			n2 = t;
			
		}
		
	}
}

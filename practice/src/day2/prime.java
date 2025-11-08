package day2;

public class prime {
	public static void main(String args[] ) {
		int n = 7, f = 1;
		System.out.println("prime or not : "+n);
		
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				System.out.println("Is not prime");
				f = 0;
				break;
			}
		}
		if(f == 1) {
			System.out.println("Is prime");
		}
		
		
		
	}
}

package day2;

public class palindrome {
	public static void main(String args[] ) {
		
		int n = 1556551, rev = 0;
		System.out.println("Palindrome : "+n);
		int t = n;
		while(t != 0) {
			int d = t % 10;
			rev = rev*10 + d;
			t /= 10;
		}
		if(n == rev)System.out.println("Yes");
		else System.out.println("no");
		
	}
}

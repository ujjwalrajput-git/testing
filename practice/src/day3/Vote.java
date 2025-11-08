package day3;

public class Vote {
	static boolean checkEligibility(int n) {
		if(n>18) return true;
		else return false;
	}
	public static void main(String args[] ) {
		int n = 10;
		System.out.println("Voter : "+n);
		if(checkEligibility(n) == true)System.out.println("Yes");
		else System.out.println("No");
		
		
	}
}

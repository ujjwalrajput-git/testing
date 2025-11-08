package day2;

public class leftTri {
	public static void main(String args[] ) {
		System.out.println("left triangle");
		int n = 5;
		for(int i = 0; i<5; i++) {
			for(int k = 0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

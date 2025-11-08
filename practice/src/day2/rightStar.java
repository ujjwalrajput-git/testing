package day2;

public class rightStar {
	public static void main(String args[] ) {
		System.out.println("Right triangle");
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

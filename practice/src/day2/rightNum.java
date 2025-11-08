package day2;

public class rightNum {
	public static void main(String args[] ) {
		System.out.println("Right triangle numbers");
		int t = 1;
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				System.out.print(t+++" ");
			}
			System.out.println();
		}
		
	}

}

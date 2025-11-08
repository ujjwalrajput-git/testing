package day2;

public class arr {
	public static void main(String args[] ) {
		System.out.println("Array");
		int[] ar1 = {10, 20, 30, 40, 50};
		for(int i = 0; i < 5; i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		for(int n:ar1)
			System.out.print(n+" ");
	}
}

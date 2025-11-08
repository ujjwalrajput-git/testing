package day3;

public class SmallestInArray {
	static int findSmall(int[] arr) {
		int res = arr[0];
		for(int i = 1; i < arr.length; i++) {
			res = Math.min(res,arr[i]);
		}
		return res;
				
	}
	public static void main(String[] args) {
		int[] arr = {10,2,3,8,9,54,7,5,51,6,5,8,4,8,9,7,3,6,4,5,8,5,68,4,4};
		System.out.println("smallest in array : "+findSmall(arr));
	}

}

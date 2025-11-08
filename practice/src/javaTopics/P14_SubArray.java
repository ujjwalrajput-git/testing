package javaTopics;

import java.util.Arrays;

public class P14_SubArray {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		for(int outer = 0; outer <= arr.length; outer++) {
			for(int inner = outer;inner <= arr.length; inner++) {
				int[]sub = Arrays.copyOfRange(arr, outer, inner);
				for(int num:sub) {
					System.out.print(num+" ");
				}
				System.out.println();
			}
		}
	}
}

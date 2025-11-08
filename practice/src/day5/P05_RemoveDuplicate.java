package day5;

import java.util.*;

public class P05_RemoveDuplicate {
	public static void main(String[] args) {
		Integer[] arr = {10, 10, 20, 50, 80, 30, 50};
		
		for(int i:arr)
			System.out.print(i+" ");
	
		System.out.println();
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i:arr) {
			set.add(i);
		}

		System.out.println(set);
		
		Set<Integer> treeSet = new TreeSet<Integer>();
		
		for(int i:arr) {
			treeSet.add(i);
		}

		System.out.println(treeSet);
	}
}

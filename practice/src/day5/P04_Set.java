package day5;

import java.util.*;

public class P04_Set {
	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(15);
		
		System.out.println(set1);
		
		set2.add(10);
		set2.add(1);
		set2.add(1);
		set2.add(20);
		set2.add(3);
		set2.add(40);
		set2.add(5);
		set2.add(7);
		
		System.out.println(set2);
		
		HashSet<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println(union);
		
		HashSet<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		HashSet<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
		
		
		
		
		
	}
}













package day5;
import java.util.*;

public class P01_CollectionList {
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		l2.add(40);
		l2.add(60);
		l2.add(50);
		
		System.out.println("Array list \n"+l1);
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l1.get(4));
		System.out.println(l1.contains(60));
		System.out.println(l1.indexOf(40));
		l1.remove(0);
		System.out.println(l1);
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		System.out.println(l1.reversed());
		
	}

}

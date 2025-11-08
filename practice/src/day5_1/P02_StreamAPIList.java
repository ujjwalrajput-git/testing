package day5_1;

import java.util.*;
import java.util.stream.Collectors;

public class P02_StreamAPIList {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		List<Integer> greater = list.stream().filter(s->(s>10)).collect(Collectors.toList());
		System.out.println(greater);
		
		
	}
}

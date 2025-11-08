package day5;

import java.util.*;
import java.util.Map.Entry;;

public class P07_HashMap {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "a1");
		map.put(102, "a2");
		map.put(103, "a3");
		
		System.out.println(map);
		System.out.println(map.get(101));
		
		for(Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " : "+e.getValue());
		}
		
	}
}








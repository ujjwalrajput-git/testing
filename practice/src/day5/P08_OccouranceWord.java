package day5;

//Occurrence of words in a string

import java.util.*;

public class P08_OccouranceWord {
	public static void main(String[] args) {
		String str = "today the day is very very very nice day";
		String[] words = str.split(" ");
		
//		for(String s : arr)
//			System.out.println(s);
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(String i : words) {
			if(map.containsKey(i)) {
				int val = map.get(i);
				map.put(i, ++val);
			}
			else
				map.put(i,1);
		}
		System.out.println(map);
	}
}

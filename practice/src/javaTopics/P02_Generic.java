package javaTopics;

import java.awt.List;
import java.util.ArrayList;

class Practice<Generic>{
	void add(Generic val1, Generic val2) {
		System.out.println(val1+" "+val2);
	}
	void sub(ArrayList<?> lsit) {
		System.out.println(lsit.get(0));
	}
}

public class P02_Generic {
	public static void main(String[] args) {
		Practice<Integer> p1 = new Practice<Integer>();
		p1.add(10, 20);
		Practice<String> p2 = new Practice<String>();
		p2.add("hello", "java");
		Practice<Float> p3 = new Practice<Float>();
		p3.add(10.11F, 20.22F);
		ArrayList<String> list = new ArrayList<String>();
		list.add("12345");
		p3.sub(list);
		
	}
}

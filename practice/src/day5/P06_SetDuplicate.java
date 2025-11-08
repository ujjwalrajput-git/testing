package day5;

import java.util.*;

public class P06_SetDuplicate {
	public static void main(String[] args) {
		
		Set<Student> o = new HashSet<Student>();
		
		Student s1 = new Student(101,"sonu");
		Student s2 = new Student(101,"sonu");
		
		o.add(s1);
		o.add(s2);
		
		for(Student i:o)
			System.out.println(i.getId()+" : "+i.getName());
	}
}

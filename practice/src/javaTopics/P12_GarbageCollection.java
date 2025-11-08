package javaTopics;

public class P12_GarbageCollection {
	public class Student{
		Student (){
			String obj = new String();
		}
	}
	class Program_GC{
		void hello() {
			System.out.println("Hello java");
		}
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1 = null;
		
		Student s2 = new Student();
		s2 = s1;
		
		Program_GC prog = new Program_GC();
		prog.hello();
		
		String s1 = "Hello";
		String s2 = s1;
		s1 = null;
	}
}

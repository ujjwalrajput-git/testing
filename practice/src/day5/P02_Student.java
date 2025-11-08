package day5;

import java.util.*;

class Student{
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}

public class P02_Student {
	public static void main(String[] args) {
		
		ArrayList<Student> sArr = new ArrayList<Student>();
		
		Student s1 = new Student(101,"raj");
		Student s2 = new Student(102,"rajat");
		Student s3 = new Student(103,"raju");
		
		sArr.add(s1);
		sArr.add(s2);
		sArr.add(s3);
		
		for(Student s:sArr) {
			System.out.println(s.getId()+" "+s.getName());
		}
		
	}
}







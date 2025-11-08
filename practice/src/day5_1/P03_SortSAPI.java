package day5_1;

import java.util.*;
import java.util.stream.Collectors;

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
	int id;
	String name;
	
	Student(int id , String name){
		this.id = id;
		this.name = name;
	}
	
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
	
}

public class P03_SortSAPI {
	public static void main(String[] args) {
		Student s1 = new Student(104,"kanuj");
		Student s2 = new Student(102,"Sonu");
		Student s3 = new Student(103,"Monu");
		Student s4 = new Student(101,"Monusha");
		Student s5 = new Student(101,"Monusha");
		
		
		List<Student> list = new ArrayList<Student>();
		list.add(s1); list.add(s2); list.add(s3); list.add(s4); list.add(s5);
		
		for(Student s : list) {
			System.out.print(s.id+" : "+s.name+"\t");
		}
		System.out.println();
		
		List<Student> sortedList = list.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
		
		for(Student s : sortedList) {
			System.out.print(s.id+" : "+s.name+"\t");
		}
		System.out.println();
		
		List<Student> sortedList1 = list.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
		
		for(Student s : sortedList1) {
			System.out.print(s.id+" : "+s.name+"\t");
		}
		System.out.println();
		
		list.stream().filter(s->s.getName().length()>4).forEach(s->System.out.print(s.id + " : " + s.name +"\t"));
		System.out.println();
		
		list.stream().forEach(s->System.out.print(s.id + " : " + s.name + "\t"));
		
		//Optional  Max Value
		
		Optional<Integer> maxVal = list.stream().map(Student::getId).reduce(Integer::max);
		System.out.println("\n" + maxVal.get());
		
		Optional<Student> firstData = list.stream().sorted(Comparator.comparingInt(Student::getId)).findFirst();
		System.out.println("\n" + firstData.get().getName()+" : "+firstData.get().getName());
		
		System.out.println("\nLimit");
		list.stream().limit(2).forEach(s->System.out.print(s.getId()+" : "+s.getName()+"\t"));
		System.out.println();
		
		System.out.println("\nSkip");
		list.stream().skip(2).forEach(s->System.out.print(s.getId()+" : "+s.getName()+"\t"));
		System.out.println();
		
		System.out.println("\nSum");
		int sum = list.stream().mapToInt(Student::getId).sum();
		System.out.println(sum);
		
		System.out.println("\nDistinct");
		list.stream().distinct().forEach(s->System.out.print(s.id+" : "+s.name+"\t"));
		
		Map<Integer, List<Student>> groupList = list.stream().collect(null) 
	}
	
}










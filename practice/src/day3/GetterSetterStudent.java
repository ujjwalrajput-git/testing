package day3;

public class GetterSetterStudent {
	public static class Student{
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
		int id;
		String name;
		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}
		public void print() {
			System.out.println("name : "+name);
			System.out.println("id : "+id);
		}
		
	}
	public static void main(String[] args) {
		Student s1 = new Student(101,"Sonu");
		s1.print();
				
	}
}

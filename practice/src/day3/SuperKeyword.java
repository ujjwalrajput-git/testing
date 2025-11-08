package day3;

class Parent {
	Parent(String house){
		this.house = house;
	}
	String house;
}

class Child extends Parent{
	Child(String house){
		super(house);
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		System.out.println("hi");
		Child obj = new Child("2bk");
		System.out.println(obj.house);
	}
}

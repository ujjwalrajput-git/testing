package day4;

public class P8_String {
	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1);
		s1.concat(" java");
		System.out.println(s1.concat(" java"));
		System.out.println(s1);
		s1 = "hello world java";
		System.out.println(s1);
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		System.out.println(s1.replace(' ','-'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('w'));
		System.out.println(s1);
		
		String s2 = "          bro this has space             ";
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s2.stripLeading());
		System.out.println(s2.stripTrailing());
		
		String s3 = "hello i am today";
		System.out.println(s3);
		String[] s4 = s3.split(" ");
		
		for(String i:s4)
			System.out.println(i);
	}
}
















package day4;

public class P9_WordInString {
	public static void main(String[] args) {
		
		String s = "hello i am java";
		
		System.out.println("number of Words : ");
		
		int sum = 1;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') 
				sum++;
		}
		
		System.out.println("method 1 : "+sum);
		
		System.out.println("method 2 : "+(s.split(" ") ).length );
		
	}
}

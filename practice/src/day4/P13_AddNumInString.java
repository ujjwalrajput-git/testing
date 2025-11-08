package day4;

public class P13_AddNumInString {
	public static void main(String[] args) {
		String s1 = "hello12mo5gh";
		int sum = 0;
		
		for(int i = 0; i <= s1.length()-1; i++) {
			
			if( Character.isDigit(s1.charAt(i) ) ) {
			
				int num =  Integer.parseInt(s1.charAt(i)+"");
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}

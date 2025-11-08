package day4;

public class P14_SumInStringTogether {
	public static void main(String[] args) {
		String s1 = "hello12mo5gh";
		int sum = 0;
		StringBuilder temp = new StringBuilder("");
		for(int i = 0; i < s1.length(); i++) {
			
			if( Character.isDigit(s1.charAt(i) ) ) {
				for(int j = i; j < s1.lastIndexOf(j); j++) {
					if( !Character.isDigit(s1.charAt(j))  ) ){
						//temp = s1.substring(i,j);
					}
				}
				int num =  Integer.parseInt(s1.charAt(i)+"");
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}

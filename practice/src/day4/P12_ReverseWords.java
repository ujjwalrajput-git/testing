package day4;

public class P12_ReverseWords {
	public static void main(String[] args) {
		String s1 = "The day today is nice";
		String[] s = s1.split(" ");
		
		for(String i:s) {
			StringBuilder str = new StringBuilder(i);
			System.out.print(str.reverse()+" ");
		}
		
	}
}

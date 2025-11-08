package day3;

public class PrintAscii {
	static void printAsci() {
		char smallAlphs = 'a';
		char bigAlphs = 'A';
		for(; smallAlphs <= 'z'; smallAlphs++, bigAlphs++)
			System.out.println(smallAlphs+" "+bigAlphs+" "+(int)smallAlphs+" : "+(int)bigAlphs);
			
		
	}
	public static void main(String[] args) {
		printAsci();
		//char smallAlpha = 'a';
	}
}

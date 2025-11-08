package day2;

public class armstrong {
	public static void main(String args[] ) {
		
		int sum = 0, n = 153, d = 0;
		System.out.println("Armstrong number : "+n);
		int t = n;
		while(t != 0) {
			d++;
			t = t / 10;
		}
		//System.out.println(d);
		t = n;
		while(t != 0) {
			sum = sum + (int)Math.pow((t % 10), d);
			t = t / 10;
		}
		if(sum == n)System.out.println("yes");
		else System.out.println("no");
		
	}

}

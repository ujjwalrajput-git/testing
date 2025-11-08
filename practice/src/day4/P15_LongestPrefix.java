package day4;

public class P15_LongestPrefix {
	public static void main(String[] args) {
		String[] arr = {"rajuat", "rajuesh", "rajumohan", "rajushree", "raju"};
		
		int min = Integer.MAX_VALUE, len = arr.length;
		int last = 0;
		boolean flag = true;
		
		for(String s:arr) {
			min = Math.min(min, s.length());
		}
		//
		System.out.println(min+" "+len);
		for(int i = 0; i < min; i++) {
			char ch = arr[0].charAt(i);
			
			for(int j = 1; j < len; j++) {
				if(ch != arr[j].charAt(i)) {
					
					flag = false;
					break;
				}
				last = i;
			}
			if(flag == false) break;
		}
		//System.out.println(last);
		System.out.println(arr[0].substring(0,last+1) );
	}

}

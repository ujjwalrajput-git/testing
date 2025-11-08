package selday1;

import java.util.*;

public class P17_Exception {
	public static void main(String[] args) {

		try {
			
			System.out.println("Hello");
			System.out.println(5/0);
			System.out.println("bye");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" Exception :(");
		}
		
	}
}

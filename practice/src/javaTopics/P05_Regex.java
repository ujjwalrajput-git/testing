package javaTopics;

public class P05_Regex {
	public static void main(String[] args) {
		String email1 = "abc@gmail.com";
		String email2 = "abc123@gmail465.com";
		String regex = "^[a-zA-Z]{3,6}[@][a-z]{5}[.](com|in)$";
		System.out.println(email2.matches(regex));
		System.out.println(email1.matches(regex));
	}
}

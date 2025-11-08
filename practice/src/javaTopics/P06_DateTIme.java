package javaTopics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P06_DateTIme {
	public static void main(String[] args) {
		String s1 = "21-08-2025 14:00:00";
		String s2 = "22-08-2025 13:00:00";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime input1 = LocalDateTime.parse(s1,dtf);
		LocalDateTime input2 = LocalDateTime.parse(s2,dtf);
		
		System.out.println(input1.isBefore(input2));
	}
}

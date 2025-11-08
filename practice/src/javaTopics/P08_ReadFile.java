package javaTopics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class P08_ReadFile {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Ujjwal.Rajput\\eclipse-workspace\\practice\\src\\javaTopics\\OpFile.txt");
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String st;
		while((st=br.readLine()) != null) {
			System.out.println(st);
		}
	}
}

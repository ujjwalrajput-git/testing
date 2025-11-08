package javaTopics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P09_WriteFile {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Ujjwal.Rajput\\eclipse-workspace\\practice\\src\\javaTopics\\OpFile.txt");
		FileWriter fw = new FileWriter(file,true);
		fw.write("\nthis is new line");
		fw.close();
	}
}

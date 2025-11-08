package javaTopics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// convert object into byte stream
// transient keyword (will not convert )

class User implements Serializable{
	int id; 
	String name;
	transient String pass;
	User(int id, String name, String pass){
		this.id = id;
		this.name = name;
		this.pass = pass;
	}
}

public class P01_Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("C:\\Users\\Ujjwal.Rajput\\eclipse-workspace\\practice\\src\\javaTopics\\OpFile.txt");
		User obj = new User(101, "rahul", "Pass@123");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ios = new ObjectInputStream(fis);
		User obj2 = (User)ios.readObject();
		System.out.println(obj2.id+" "+obj2.name+" "+obj2.pass);
	}
}







package javaTopics;

import org.openqa.selenium.chrome.ChromeDriver;

class MyThread extends Thread {
    public void run() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.close();
        System.out.println(Thread.currentThread().getId());
    }
}

public class P10_Thread {
    public static void main(String[] args) {
        for (int num = 1; num <= 50; num++) {
            MyThread obj = new MyThread(); 
            obj.start();
        }
    }
}
package run;

import mythread.MyThread2;
import mythread.MyThread3;

public class Run3 {
	public static void main(String[] args) throws InterruptedException {
		MyThread3 mythread = new MyThread3();
		System.out.println("begin =" + System.currentTimeMillis());
		Thread.sleep(2000);
		mythread.start();
		System.out.println("end   =" + System.currentTimeMillis());
	}
}

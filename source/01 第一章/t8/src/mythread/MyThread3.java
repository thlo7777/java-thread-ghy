package mythread;

public class MyThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("run threadName="
				+ this.currentThread().getName() + " begin ="
				+ System.currentTimeMillis());
		//Thread.sleep(2000);
		System.out.println("run threadName="
				+ this.currentThread().getName() + " end   ="
				+ System.currentTimeMillis());
	}
}

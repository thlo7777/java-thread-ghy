package service;

public class Service {
	private   Object object = new Object();
	public  void print(String stringParam) {
		try {
			//synchronized (stringParam) {
			synchronized (object) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

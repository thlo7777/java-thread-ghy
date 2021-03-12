package exthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 500000; i++) {
				System.out.println("i=" + (i + 1));
				if (this.isInterrupted()) {
					System.out.println("thread break");
					//System.out.println("第一个interrupted()"+this.interrupted());
					//System.out.println("第二个interrupted()"+this.interrupted());
					//break;
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			 e.printStackTrace();
		}
	}
}

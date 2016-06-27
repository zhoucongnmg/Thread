package mianshi;

import java.util.concurrent.CountDownLatch;

public class ThreadC implements Runnable{
	
	private CountDownLatch latch2;
	
	public ThreadC(CountDownLatch latch1,CountDownLatch latch2){
		this.latch2 = latch2;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程C运行");
		latch2.countDown();
	}

}

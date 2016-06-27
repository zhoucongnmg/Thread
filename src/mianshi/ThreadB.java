package mianshi;

import java.util.concurrent.CountDownLatch;

public class ThreadB implements Runnable{
	
	private CountDownLatch latch1;
	private CountDownLatch latch2;
	
	public ThreadB(CountDownLatch latch1,CountDownLatch latch2){
		this.latch1 = latch1;
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
		System.out.println("线程B运行");
		latch1.countDown();
		latch2.countDown();
	}

}

package mianshi;

import java.util.concurrent.CountDownLatch;

public class ThreadA implements Runnable{
	private CountDownLatch latch1;
	public ThreadA(CountDownLatch latch1,CountDownLatch latch2){
		this.latch1 = latch1;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程A运行");
		latch1.countDown();
	}

}

package mianshi;

import java.util.concurrent.CountDownLatch;

public class ThreadE implements Runnable{
	
	private CountDownLatch latch2;
	
	public ThreadE(CountDownLatch latch1,CountDownLatch latch2){
		this.latch2 = latch2;
	}
	@Override
	public void run() {
		try {
			latch2.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程E运行");
	}

}

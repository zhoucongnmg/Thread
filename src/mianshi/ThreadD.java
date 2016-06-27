package mianshi;

import java.util.concurrent.CountDownLatch;

public class ThreadD implements Runnable{
	
	private CountDownLatch latch1;
	
	public ThreadD(CountDownLatch latch1,CountDownLatch latch2){
		this.latch1 = latch1;
	}
	@Override
	public void run() {
		try {
			latch1.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程D运行");
	}

}

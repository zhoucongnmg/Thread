package ali.mianshi;

import java.util.concurrent.CountDownLatch;

public class Test {

	public static volatile boolean flag = false;
	public static void main(String[] args) {
		
		ThreadB t2 = new ThreadB();
		ThreadA t1 = new ThreadA();		
		t2.start();
		t1.start();
		
	}

}

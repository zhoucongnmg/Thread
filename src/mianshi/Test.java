package mianshi;

import java.util.concurrent.CountDownLatch;
/**
 * �߳�AB��ɺ�ִ��D��BC��ɺ�ִ��E
 * @author zhoucong
 *
 */
public class Test {

	public static void main(String[] args) {
		CountDownLatch latch1 = new CountDownLatch(2);
		CountDownLatch latch2 = new CountDownLatch(2);
		new Thread(new ThreadA(latch1,latch2)).start();
		new Thread(new ThreadB(latch1,latch2)).start();
		new Thread(new ThreadC(latch1,latch2)).start();
		new Thread(new ThreadD(latch1,latch2)).start();
		new Thread(new ThreadE(latch1,latch2)).start();
	}

}

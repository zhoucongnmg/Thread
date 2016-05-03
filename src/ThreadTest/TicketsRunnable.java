package ThreadTest;

public class TicketsRunnable {
	public static void main(String[] args) {
		//多个线程使用同一个Runnable，tickeCount是多个线程共享的，所以一共卖出5张票
		Runnable mr = new MyRunnable();
		Thread th1 = new Thread(mr, "窗口1");
		Thread th2 = new Thread(mr, "窗口2");
		Thread th3 = new Thread(mr, "窗口3");

		th1.start();
		th2.start();
		th3.start();
	}
}

class MyRunnable implements Runnable {

	private Integer ticketCount = 5; // 共有5张票

	@Override
	public void run() {
		while (ticketCount > 0) {
			ticketCount--;
			System.out.println(Thread.currentThread().getName() + "买了一张票" + "剩余票数为" + ticketCount);
		}

	}

}

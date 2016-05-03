package ThreadTest;

public class TicketsThread {
	public static void main(String[] args) {
		// 创建三个线程，模拟窗口买票
		Thread mt1 = new MyThread("窗口1");
		Thread mt2 = new MyThread("窗口2");
		Thread mt3 = new MyThread("窗口3");

		mt1.start();
		mt2.start();
		mt3.start();
	}
}

class MyThread extends Thread {
	//使用Thread时,每个线程拥有独立的tickeCount，所以最终卖出15张票
	private Integer ticketCount = 5; // 共有5张票
	private String name; // 线程名字

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		while (ticketCount > 0) {
			ticketCount--;
			System.out.println(name + "买了一张票" + "剩余票数为" + ticketCount);
		}

	}

}

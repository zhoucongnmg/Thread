package ThreadTest;

public class TicketsRunnable {
	public static void main(String[] args) {
		//����߳�ʹ��ͬһ��Runnable��tickeCount�Ƕ���̹߳���ģ�����һ������5��Ʊ
		Runnable mr = new MyRunnable();
		Thread th1 = new Thread(mr, "����1");
		Thread th2 = new Thread(mr, "����2");
		Thread th3 = new Thread(mr, "����3");

		th1.start();
		th2.start();
		th3.start();
	}
}

class MyRunnable implements Runnable {

	private Integer ticketCount = 5; // ����5��Ʊ

	@Override
	public void run() {
		while (ticketCount > 0) {
			ticketCount--;
			System.out.println(Thread.currentThread().getName() + "����һ��Ʊ" + "ʣ��Ʊ��Ϊ" + ticketCount);
		}

	}

}

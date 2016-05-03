package ThreadTest;

public class TicketsThread {
	public static void main(String[] args) {
		// ���������̣߳�ģ�ⴰ����Ʊ
		Thread mt1 = new MyThread("����1");
		Thread mt2 = new MyThread("����2");
		Thread mt3 = new MyThread("����3");

		mt1.start();
		mt2.start();
		mt3.start();
	}
}

class MyThread extends Thread {
	//ʹ��Threadʱ,ÿ���߳�ӵ�ж�����tickeCount��������������15��Ʊ
	private Integer ticketCount = 5; // ����5��Ʊ
	private String name; // �߳�����

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		while (ticketCount > 0) {
			ticketCount--;
			System.out.println(name + "����һ��Ʊ" + "ʣ��Ʊ��Ϊ" + ticketCount);
		}

	}

}

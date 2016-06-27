package ali.mianshi;

public class ThreadB extends Thread {

	public void run() {
		while (true) {
			if (Test.flag) {
				System.out.println("BB");
				break;
			}
		}
	}
}

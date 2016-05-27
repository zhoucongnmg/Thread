package google.mianshi;

public class Test {
	public static void main(String[] args) {
		WriteUtil util = new WriteUtil();
		Thread t1 = new Thread(new WriteRunnable(util, 1, '1'));
		Thread t2 = new Thread(new WriteRunnable(util, 2, '2'));
		Thread t3 = new Thread(new WriteRunnable(util, 3, '3'));
		Thread t4 = new Thread(new WriteRunnable(util, 4, '4'));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

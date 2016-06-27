package ali.mianshi;

public class ThreadA extends Thread{

	ThreadB t;
	public void run(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("AA");
		Test.flag = true;
	}
	
}

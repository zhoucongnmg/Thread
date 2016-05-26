package productAndConsume;

public class Test {
	public static void main(String[] args){
		StorageWithBlockQueue s = new StorageWithBlockQueue();
		Producter p1 = new Producter("生产者1", s);
		Producter p2 = new Producter("生产者2", s);
		Consumer c1 = new Consumer("消费者1", s);
		Consumer c2 = new Consumer("消费者2", s);
		Consumer c3 = new Consumer("消费者3", s);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(c1);
		Thread t4 = new Thread(c2);
		Thread t5 = new Thread(c3);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
}

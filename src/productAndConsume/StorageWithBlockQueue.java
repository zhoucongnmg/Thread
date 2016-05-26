package productAndConsume;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class StorageWithBlockQueue implements StorageInterface{
	private BlockingQueue<Product> queue = new ArrayBlockingQueue<Product>(10);//必须声明阻塞队列大小
	
	//BlockingQueue中的offer，如果队列慢了直接return false。
	//put 如果队列满了，将该线程加入notFull的阻塞队列，队列不满时会唤醒该线程
	public void product(Product p) throws InterruptedException{      
		queue.put(p);            //不可以用offer，只能用put。必须处理InterruptedException
	}
	//BlockingQueue中的poll如果队列为空，直接返回null。
	//take如果队列为空，将该线程加入notEmpty的阻塞队列，队列不为空时唤醒该线程
	public Product consume() throws InterruptedException{
		return queue.take();
	}
	
}

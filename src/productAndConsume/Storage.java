package productAndConsume;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Storage implements StorageInterface{
	private int size;
	private Queue<Product> queue = new LinkedList<Product>();
	private final ReentrantLock lock = new ReentrantLock();
	private final Condition notFull = lock.newCondition();
	private final Condition notEmpty = lock.newCondition();
	
	public Storage(int size){
		this.size = size;
	}
	
	public void put(Product p) throws InterruptedException{
		if(p == null)
			return;
		lock.lockInterruptibly();
		try{
			while(queue.size() == size)       
				notFull.await();
			queue.offer(p);
			notEmpty.signal();
		}
		finally{
			lock.unlock();
		}	
	}
	
	public Product take() throws InterruptedException{
		lock.lockInterruptibly();
		try{
			while(queue.size() == 0)
				notEmpty.await();
			Product product = queue.poll();
			notFull.signal();
			return product;
		}
		finally{
			lock.unlock();
		}
	}

	@Override
	public void product(Product p) throws InterruptedException {
		put(p);
		
	}

	@Override
	public Product consume() throws InterruptedException {
		return take();
	}
}

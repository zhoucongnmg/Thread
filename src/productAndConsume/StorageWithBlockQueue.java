package productAndConsume;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class StorageWithBlockQueue implements StorageInterface{
	private BlockingQueue<Product> queue = new ArrayBlockingQueue<Product>(10);//���������������д�С
	
	//BlockingQueue�е�offer�������������ֱ��return false��
	//put ����������ˣ������̼߳���notFull���������У����в���ʱ�ỽ�Ѹ��߳�
	public void product(Product p) throws InterruptedException{      
		queue.put(p);            //��������offer��ֻ����put�����봦��InterruptedException
	}
	//BlockingQueue�е�poll�������Ϊ�գ�ֱ�ӷ���null��
	//take�������Ϊ�գ������̼߳���notEmpty���������У����в�Ϊ��ʱ���Ѹ��߳�
	public Product consume() throws InterruptedException{
		return queue.take();
	}
	
}

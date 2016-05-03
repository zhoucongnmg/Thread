package SynchronizedAndVolatile;

public class SynchronizedDemo {
	//�������
    private boolean ready = false;
    private int result = 0;
    private int number = 1;   
    //д����
    public synchronized void write(){
    	ready = true;	      				 //1.1				
    	number = 2;		                    //1.2			    
    }
    //������
    public synchronized void read(){			   	 
    	if(ready){						     //2.1
    		result = number*3;	 	//2.2
    	}   	
    	System.out.println("result��ֵΪ��" + result);
    }

    //�ڲ��߳���
    private class ReadWriteThread extends Thread {
    	//���ݹ��췽���д����flag������ȷ���߳�ִ�ж���������д����
    	private boolean flag;
    	public ReadWriteThread(boolean flag){
    		this.flag = flag;
    	}
        @Override                                                                    
        public void run() {
        	if(flag){
        		//���췽���д���true��ִ��д����
        		write();
        	}else{
        		//���췽���д���false��ִ�ж�����
        		read();
        	}
        }
    }

    public static void main(String[] args)  {
    	SynchronizedDemo synDemo = new SynchronizedDemo();
    	//�����߳�ִ��д����
    	synDemo.new ReadWriteThread(true).start();
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//�����߳�ִ�ж�����
    	synDemo.new ReadWriteThread(false).start();
    }
}


package com.imooc.concurrent.base;

//�����߳�
//ģ����ս˫������Ϊ
public class ArmyRunnable implements Runnable {

	//volatile��֤���߳̿�����ȷ�Ķ�ȡ�����߳�д���ֵ
	//�ɼ��� ref JMM�� happens-beforeԭ��
	
	//�̰߳�ȫ�˳�����
	private volatile boolean keepRunning = true;

	public void stopThread(){
		this.keepRunning = false;
	}
	@Override
	public void run() {
		while(keepRunning){
			//����5����
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"�����Է�["+i+"]");
				//�ó��˴�����ʱ�䣬�´θ�˭��������һ���أ�(�������Ϊ��ǰ�߳��ó�ʱ��Ƭ��cpu���·���)
				Thread.yield();
			}					
		}
		
		System.out.println(Thread.currentThread().getName()+"������ս����");

	}

}

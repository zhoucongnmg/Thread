package google.mianshi;
/**
 * �ĸ��̣߳��߳�1ֻ�ܴ�ӡ1���߳�2ֻ�ܴ�ӡ2.������
 * Ҫ�����ĸ��ļ������12341234...23412341..34123412...41234123....
 * @author zhoucong
 *
 */
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

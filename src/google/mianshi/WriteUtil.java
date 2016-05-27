package google.mianshi;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUtil {
	//��ǰ�̺߳�
	private int currentTid = 1;
	//��ǰ�ļ���
	private int currentFid = 1;
	//д���ļ�����
	private int count = 0;
	
	public void write(char value){
		//true��ʾ����Դ�ļ����ݣ��ں���׷��
		try(FileWriter fw = new FileWriter("E:\\file" + currentFid + ".txt", true)){
			fw.write(value);
			fw.flush();
			count++;
			generateNextTid();
			generateNextFid();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//���ļ�д���������ļ�1д1�������ļ�2д2.����
	private void generateNextTid(){
		if(count%4 == 0){
			int temp = (currentTid+2)%4;
			currentTid = temp == 0 ? 4 : temp;
		}
		else{
			if(currentTid == 4)
				currentTid = 1;
			else
				currentTid++;
		}
	}
	
	private void generateNextFid(){
		if(count%4 == 0)
			currentFid = 1;
		else
			currentFid = currentFid+1;
	}
	
	public int getCurrentTid(){
		return this.currentTid;
	}
}

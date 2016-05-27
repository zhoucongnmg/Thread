package google.mianshi;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUtil {
	//当前线程号
	private int currentTid = 1;
	//当前文件号
	private int currentFid = 1;
	//写入文件次数
	private int count = 0;
	
	public void write(char value){
		//true表示保留源文件内容，在后面追加
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
	//按文件写，即先向文件1写1，在向文件2写2.。。
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

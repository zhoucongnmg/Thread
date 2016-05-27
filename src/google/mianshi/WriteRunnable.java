package google.mianshi;

public class WriteRunnable implements Runnable {

	private int tid;
	private char writeValue;
	private WriteUtil util;

	public WriteRunnable(WriteUtil util, int tid, char writeValue) {
		this.tid = tid;
		this.writeValue = writeValue;
		this.util = util;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			synchronized (util) {
				while (this.tid != this.util.getCurrentTid()) {
					try {
						this.util.wait(); // 注意wait需要加trycatch
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				util.write(this.writeValue);
				util.notifyAll();
			}
		}
	}

}

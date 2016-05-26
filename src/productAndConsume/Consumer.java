package productAndConsume;

public class Consumer implements Runnable {

	private String name;
	private StorageInterface storage;

	public Consumer(String name, StorageInterface storage) {
		this.name = name;
		this.storage = storage;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Product p = storage.consume();
				System.out.println(name + "消费了" + p.getId() + "号产品");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

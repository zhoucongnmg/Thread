package productAndConsume;

public class Producter implements Runnable{

	private String name;
	private StorageInterface storage;

	
	public Producter(String name,StorageInterface storage){
		this.name = name;
		this.storage = storage;
	}

	@Override
	public void run() {
		while(true){
			Product p = new Product((int)(Math.random()*1000));
			try {
				System.out.println(name + "准备生产" + p.getId() +"号产品");
				storage.product(p);		
				System.out.println(name + "生产了" + p.getId() +"号产品");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
	}
}

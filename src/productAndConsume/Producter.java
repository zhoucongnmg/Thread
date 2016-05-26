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
				System.out.println(name + "׼������" + p.getId() +"�Ų�Ʒ");
				storage.product(p);		
				System.out.println(name + "������" + p.getId() +"�Ų�Ʒ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
	}
}

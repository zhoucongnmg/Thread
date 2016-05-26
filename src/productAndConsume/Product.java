package productAndConsume;

public class Product {
	private int id;
	
	public Product(int id){
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + "]";
	}
	
	public int getId(){
		return id;
	}
}

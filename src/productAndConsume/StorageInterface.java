package productAndConsume;

public interface StorageInterface {
	void product(Product p)throws InterruptedException;
	Product consume()throws InterruptedException;
}

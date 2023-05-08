public class Product {

	private String description;
	private String productID;
	private double price;

	public Product() {}

	public Product(String description, String productID, double price) {
		this.description = description;
		this.productID = productID;
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}	

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public String getProductID() {
		return this.productID;
	}

	public double getPrice() {
		return this.price;
	}

	public String toString() {
    	return String.format("[%s] %s: $%.2f", productID, description, price);
	}
}
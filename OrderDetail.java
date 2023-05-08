public class OrderDetail
{
	private int quatity;
	private Product product;

	public OrderDetail() {}

	public OrderDetail(Product product, int quatity) {
		this.quatity = quatity;
		this.product = product;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	public int getQuatity() {
		return this.quatity;
	}

	public double calcTotalPrice() {
		double thanhtien = quatity*(product.getPrice());
		return thanhtien;
	}

	public String toString() {
    	return String.format("$%.2f", calcTotalPrice());
	}
}
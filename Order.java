import java.time.LocalDate;

public class Order
{
	private int orderID;
	private LocalDate orderDate;
	private OrderDetail[] lineItems;
	private int count;

	public Order() {}

	public Order(int orderID, LocalDate orderDate) {
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.lineItems = new OrderDetail[20];
		this.count = count;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderID() {
		return this.orderID;
	}

	public LocalDate getOrderDate() {
		return this.orderDate;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return this.count;
	}

	public double calcTotalChange() {
		double total = 0;
		for (int i=0; i<count; i++) {
			total += lineItems[i].calcTotalPrice();
		}
		return total;
	}

	public OrderDetail[] getLineItems() {
		return lineItems;
	}

	public void addLineItem(Product p, int quantity) {
        lineItems[count++] = new OrderDetail(p, quantity);
    }

	public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Ma HD: ").append(orderID).append("\n");
    sb.append("Ngay lap hoa don: ").append("").append(orderDate).append("\n");
    for (int i = 0; i < count; i++) {
    	sb.append("\t").append(lineItems[i]).append("\n");
    }
    	sb.append("Total change: ").append(calcTotalChange());
    	return sb.toString();
	}
}
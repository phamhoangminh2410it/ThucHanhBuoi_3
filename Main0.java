import java.time.LocalDate;

public class Main0
{
	public static void main(String[] args)
	{
		Product data0 = new Product("sp4", "Nuoc tuong", 8000);
		Product data1 = new Product("sp1", "Gao", 18000);
		Product data2 = new Product("sp3", "Duong", 10000);
		Product data3 = new Product("sp1", "Gao", 18000);
		Order data4 = new Order(1, LocalDate.now());
		data4.addLineItem(data0, 10);
		data4.addLineItem(data1, 5);
		data4.addLineItem(data2, 1);
		data4.addLineItem(data3, 1);
		System.out.println("Ma HD: " + data4.getOrderID() + "\n" + "Ngay lap hoa don: " + data4.getOrderDate() + "\n"
							+ "STT\t" + "Ma SP\t" + "Mo ta\t\t" + "Don gia\t\n"
							+ "1\t" + data0.getDescription() + "\t" + data0.getProductID() + "\t" + data0.getPrice() + "\t\n"
							+ "2\t" + data1.getDescription() + "\t" + data1.getProductID() + "\t\t" + data1.getPrice() + "\t\n"
							+ "3\t" + data2.getDescription() + "\t" + data2.getProductID() + "\t\t" + data2.getPrice() + "\t\n"
							+ "4\t" + data3.getDescription() + "\t" + data3.getProductID() + "\t\t" + data3.getPrice() + "\t\n"
							+ "Tong tien thanh toan: " + data4.calcTotalChange());
		//System.out.println(data4.toString());
	}
}
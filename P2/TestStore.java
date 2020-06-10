
public class TestStore {

	public static void main(String[] args) {
		Customer c1 = new Customer("Abdul", "#0696", 300);
		Item i1 = new Item("Brushes", "#B2A1S2", 3, 20d);
		Item i2 = new Item("Paints", "Acrylic", 0, 40d);
		
		c1.buyItem(i1);
		System.out.println("Next item:");
		c1.buyItem(i2);
		
		System.out.println("Balance = " + c1.getBalance());
	}
}

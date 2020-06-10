
public class Customer {
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	Customer(String name, String idNo, double balance){
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
	}
	
	Customer(String name, String idNo){
		this(name, idNo, 5000d);
	}
	
	public String getName(){
		return name;
	}
	
	public String getidNo(){
		return idNo;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setIdNo(String idNo){
		this.idNo = idNo;
	}
	
	public void buyItem(Item item){
		this.item = item;
		if(this.balance >= this.item.getItemQuantity() * this.item.getItemPrice() && this.item.getItemQuantity() >= 1){
			print();
			this.balance -= this.item.getItemQuantity() * this.item.getItemPrice();
		}
		
		if(this.balance < this.item.getItemQuantity() * this.item.getItemPrice()){
			System.out.println("Insufficient Balance.");
		}
		
		if(this.item.getItemQuantity() < 1){
			System.out.println("Order is not valid.");
		}
	}
	public void print(){
		System.out.println("Item name is: " + this.item.getItemName());
		System.out.println("Item ID No. is: " + this.item.getItemIdNo());
		System.out.println("Item Quantity is: " + this.item.getItemQuantity());
		System.out.println("Item price is: " + this.item.getItemPrice());
	}
}

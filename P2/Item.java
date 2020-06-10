
public class Item {
	private String itemName;
	private String itemIdNo;
	private int itemQuantity;
	private double itemPrice;
	
	Item(String itemName, String itemIdNo, int itemQuantity, double itemPrice){
		this.itemName = itemName;
		this.itemIdNo = itemIdNo;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}
	
	Item(String itemName, String itemIdNo, int itemQuantity){
		this(itemName, itemIdNo, itemQuantity, 500d);
	}
	
	Item(String itemName, String itemIdNo){
		this(itemName, itemIdNo, 1, 500d);
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public String getItemIdNo(){
		return itemIdNo;
	}
	
	public int getItemQuantity(){
		return itemQuantity;
	}
	
	public double getItemPrice(){
		return itemPrice;
	}
	
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	
	public void setItemIdNo(String itemIdNo){
		this.itemIdNo = itemIdNo;
	}
	
	public void setItemQuantity(int itemQuantity){
		this.itemQuantity = itemQuantity;
	}
	
	public void setItemPrice(double itemPrice){
		this.itemPrice = itemPrice;
	}
}

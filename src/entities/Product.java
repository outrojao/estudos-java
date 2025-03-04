package entities;

public class Product {
	public static int generalId = 0;
	public int id = ++generalId;
	public String name;
	public double price;
	public int quantity;
	
	
	public double TotalValueInStock() {
		return (double) price * quantity;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return "ID: " + this.id + ", NAME: " + this.name + ", PRICE: " + this.price + ", QUANTITY: " + this.quantity;	
	}

}

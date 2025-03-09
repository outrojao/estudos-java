package entities;

public class Product {
	public static int generalId = 0;
	private int id = ++generalId;
	private String name;
	private double price;

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

	public String toString() {
		return "ID: " + this.id + ", NAME: " + this.name + ", PRICE: " + this.price;
	}

}

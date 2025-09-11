package com.CRUDAssignment;
abstract class Product{
	private String name;
	private double price;
	private int quantity;
	//Constructor
	public Product(String name,double price,int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		
	}
	//Getter for Product
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	//Abstract method to be implemented by subclass
	public abstract void displayDetails();
	public void updateQuanatity(int newQuantity) {
		if(newQuantity>=0) {
			this.quantity=newQuantity;
			System.out.println("Quantity for " + name + "updated to " + quantity);
		}
		else {
			System.out.println("Invalid quantity.Quantity cannot be negative.");
			
			
		}
	}
}
//subclass
class Electronics extends Product{
	private String brand;
	private String model;
	
	public Electronics(String name,double price,int quantity,String brand,String model) {
		//call Product constructor
		super(name,price,quantity);
		this.brand=brand;
		this.model=model;
		
	}
	//Getter for Electronics
	public String getBrand(){
		return brand;
	}
	public String getModel() {
		return model;
	}
	//implementing abstract method
	@Override
	public void displayDetails() {
		System.out.println("--Electronics Details--");
		System.out.println("Name : " + getName());
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + getPrice());
		System.out.println("Quantity : " + getQuantity());
	}
}
//subclass
class Grocery extends Product{
	private String expireDate;
	private String origin;
}
public class Assignment1 {

}

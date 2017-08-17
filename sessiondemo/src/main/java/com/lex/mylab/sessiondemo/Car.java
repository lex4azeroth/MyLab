package com.lex.mylab.sessiondemo;

public class Car {
	private String brand;
	private String color;
	private String price;

	public Car() {
		
	}
	
	public Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
	
	public void showDetails() {
		System.out.println(String.format("Brand is [%s] and color is [%s] and price is [%s]", brand, color, price));
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
}
package com.lex.mylab.designpattern.builder;

public class Product {

	private String name;
	private String desc;
	private String price;
	private String clazz;
	private String seriNumber;
	private String barCode;
	private String weight;
	
	public Product(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getSeriNumber() {
		return seriNumber;
	}
	public void setSeriNumber(String seriNumber) {
		this.seriNumber = seriNumber;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("XBox: Life is short, play more!");
		sb.append('\n');
		sb.append("name:\t" + name);
		sb.append('\n');
		sb.append("bar code:\t" + barCode);
		sb.append('\n');
		sb.append("Price:\t" + price);
		return sb.toString();
	}
}

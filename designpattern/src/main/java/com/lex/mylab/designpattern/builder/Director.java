package com.lex.mylab.designpattern.builder;

public class Director {

	private ProductBuilder builder;
	
	public Director(ProductBuilder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(ProductBuilder builder) {
		this.builder = builder;
	}
	
	public Product construct() {
		builder.buildBarCode();
		builder.buildPrice();
		
		return builder.getResult();
	}
}

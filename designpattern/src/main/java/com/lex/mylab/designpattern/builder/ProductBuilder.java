package com.lex.mylab.designpattern.builder;

public abstract class ProductBuilder {

	protected Product product = new Product("XBOX", "g3-2017");
	
	public abstract void buildPrice();
	public abstract void buildBarCode();
	
	public Product getResult() {
		return product;
	}
}

package com.lex.mylab.designpattern.builder;

public class XboxBuilder extends ProductBuilder {

	@Override
	public void buildPrice() {
		product.setPrice("399$");
		
	}

	@Override
	public void buildBarCode() {
		product.setBarCode("bc1111");
	}

}

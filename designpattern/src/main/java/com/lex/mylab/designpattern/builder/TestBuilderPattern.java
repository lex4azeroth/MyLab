package com.lex.mylab.designpattern.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		ProductBuilder builder = new XboxBuilder();
		Director director = new Director(builder);
		Product product = director.construct();
		System.out.println(product.toString());
		
	}
}

package com.lex.mylab.designpattern.factorymethod;

public class Biz {

	public static void main( String[] args )
    {
		DeveloperFactory factory = new HanaDeveloperFactory();
		Developer dev = factory.hireDeveloper();
		dev.code();
		
		factory = new JavaDeveloperFactory();
		dev = factory.hireDeveloper();
		dev.code();
		
		factory = new JavaScriptDeveloperFactory();
		dev = factory.hireDeveloper();
		dev.code();
		
    }
	
}
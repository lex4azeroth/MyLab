package com.lex.mylab.designpattern.simplefactory;

public class Biz {
	
	public static void main( String[] args )
    {
    	Biz biz = new Biz();
    	
    	biz.doCode("java");
    	
    	biz.doCode("javascript");
    	
    	biz.doCode("hana");
    }
	
	public void doCode(String devType) {
		Developer dev = DeveloperFactory.hireProgrammer(devType);
		dev.turnOnTheComputer();
		dev.doCode();
	}
}

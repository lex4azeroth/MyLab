package com.lex.mylab.designpattern.factorymethod;

public abstract class ProgrammerFactory {

	public void doCode() {
		Developer dev = hireDeveloper();
		dev.code();		
	}
	
	public abstract Developer hireDeveloper();
}

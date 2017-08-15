package com.lex.mylab.designpattern.abstractfactory;

public class MyScreen {

	public static void main(String[] args) {
		ControlFactory factory = new BlueScreenFactory();
		factory.newButton().onClick();
		factory.newTextField().onClick();
		
		
		factory = new RedScreenFactory();
		factory.newButton().onClick();
		factory.newTextField().onClick();
	}
}

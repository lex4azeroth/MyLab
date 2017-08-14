package com.lex.mylab.designpattern.simplefactory;

public abstract class Developer {

	public void turnOnTheComputer() {
		System.out.println("Power on....");
	}
	
	public abstract void doCode();
}

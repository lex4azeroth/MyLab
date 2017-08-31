package com.lex.mylab.designpattern.singleton;

public enum TaskManagerE {
	INSTANCE;
	
	public void sayHi() {
		System.out.println("Hi there");
	}
}

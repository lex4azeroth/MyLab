package com.lex.mylab.designpattern.factorymethod;

public class JavaDeveloperFactory implements DeveloperFactory {

	public Developer hireDeveloper() {
		return new JavaProgrammer();
	}

}

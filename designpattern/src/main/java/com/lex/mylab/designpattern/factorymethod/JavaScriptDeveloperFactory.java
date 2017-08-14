package com.lex.mylab.designpattern.factorymethod;

public class JavaScriptDeveloperFactory implements DeveloperFactory {

	public Developer hireDeveloper() {
		return new JavaScriptProgrammer();
	}

}

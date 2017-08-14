package com.lex.mylab.designpattern.factorymethod;

public class HanaDeveloperFactory implements DeveloperFactory {

	public Developer hireDeveloper() {
		return new HanaProgrammer();
	}

}

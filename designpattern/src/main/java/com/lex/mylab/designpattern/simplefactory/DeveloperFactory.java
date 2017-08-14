package com.lex.mylab.designpattern.simplefactory;

public class DeveloperFactory {

	private static Developer dev;
	
	public static Developer hireProgrammer(String devType) {
		
		if (devType.equalsIgnoreCase("java")) {
			dev = new JavaProgrammer();
		} else if (devType.equalsIgnoreCase("javascript")) {
			dev = new JavaScriptProgrammer();
		} else if (devType.equalsIgnoreCase("hana")) {
			dev = new HanaProgrammer();
		}
		
		return dev;
	}
}

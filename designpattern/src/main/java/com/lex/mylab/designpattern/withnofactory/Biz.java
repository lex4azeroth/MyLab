package com.lex.mylab.designpattern.withnofactory;

public class Biz {
	
	private String devType;
	
	public static void main(String[] args) {
    	Biz biz1 = new Biz("java");
    	biz1.doCode();
    	
    	Biz biz2 = new Biz("javascript");
    	biz2.doCode();
    	
    	Biz biz3 = new Biz("hana");
    	biz3.doCode();
	}
	
	public Biz(String devType) {
		if (devType.equalsIgnoreCase("java")) {
			this.devType = devType;
		} else if (devType.equalsIgnoreCase("hana")) {
			this.devType = devType;
		} else if (devType.equalsIgnoreCase("javascript")) {
			this.devType = devType;
		} else {
			// nothing to do.
		}
	}
	
	public void doCode() {
		if (devType.equalsIgnoreCase("java")) {
			JavaProgrammer dev = new JavaProgrammer();
			dev.coding();
		} else if (devType.equalsIgnoreCase("hana")) {
			HanaProgrammer dev = new HanaProgrammer();
			dev.coding();
		} else if (devType.equalsIgnoreCase("javascript")) {
			JavaScriptProgrammer dev = new JavaScriptProgrammer();
			dev.coding();
		}
		
	}

}

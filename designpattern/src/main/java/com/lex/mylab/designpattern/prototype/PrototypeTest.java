package com.lex.mylab.designpattern.prototype;

public class PrototypeTest {
	
	public static void main(String[] args) {
//		testCloneReport();
		testDeepCloneReport();
	}
	
	public static void testCloneReport() {
		ReportPrototype rp = new ReportPrototype();
		rp.setDescription("aaa");
		rp.setName("bbb");
		rp.setReporter("ccc");
		rp.setType("ddd");
		showReport(rp);
		
		ReportPrototype rp2 = rp.clone();
		rp2.setReporter("raymond");
		showReport(rp2);
		
		System.out.println("rp == rp2 ? " + (rp == rp2));
		System.out.println("rp.desc == rp2.desc ? " + (rp.getDescription() == rp2.getDescription()));
		System.out.println("rp.name == rp2.name ? " + (rp.getName() == rp2.getName()));
		System.out.println("rp.reporter == rp2.reporter ? " + (rp.getReporter() == rp2.getReporter()));
		System.out.println("rp.type == rp2.type ? " + (rp.getType() == rp2.getType()));		
	}
	
	public static void showReport(ReportPrototype rp) {
		System.out.println("*******report*******");
		System.out.println("report id: " + rp.toString());
		System.out.println("report des: " + rp.getDescription());
		System.out.println("report name: " + rp.getName());
		System.out.println("report reporter: " + rp.getReporter());
		System.out.println("report type: " + rp.getType());
		System.out.println("*******end*******");
	}
	
	public static void testDeepCloneReport() {
		ReportWithAttPrototype rpwa = new ReportWithAttPrototype();
		rpwa.setName("daaa");
		rpwa.setOwner("downer");
		rpwa.setType("dtype");
		Attachment att = new Attachment();
		att.setName("attname");
		att.setOwner("attOwner");
		att.setType("atttype");
		rpwa.setAtt(att);
		
		showReport(rpwa);
		
		ReportWithAttPrototype rpwa2 = rpwa.deepClone();
		rpwa2.setOwner("raymond");
		showReport(rpwa2);
		
		ReportWithAttPrototype rpwa3 = rpwa.clone();
		showReport(rpwa3);
	}
	
	public static void showReport(ReportWithAttPrototype rpwa) {
		System.out.println("*******report*******");
		System.out.println("report id: " + rpwa.toString());
		System.out.println("report name: " + rpwa.getName());
		System.out.println("report owner: " + rpwa.getOwner());
		System.out.println("report type: " + rpwa.getType());
		System.out.println("report Att****");
		System.out.println("att id" + rpwa.getAtt().toString());
		System.out.println("att name: " + rpwa.getAtt().getName());
		System.out.println("att owner: " + rpwa.getAtt().getOwner());
		System.out.println("att type: " + rpwa.getAtt().getType());
		System.out.println("***");
		System.out.println("*******end*******");
	}

}

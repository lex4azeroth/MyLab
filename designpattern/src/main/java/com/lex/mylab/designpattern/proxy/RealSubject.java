package com.lex.mylab.designpattern.proxy;

public class RealSubject extends Subject {

	public RealSubject() {
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void request() {
		System.out.println("Now requesting...");
	}

}

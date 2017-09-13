package com.lex.mylab.designpattern.proxy;

public class Proxy extends Subject {
	
	private RealSubject realSubject;

	public void preRequest() {
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		
		System.out.println("Preparing...");
	}
	
	@Override
	public void request() {
		preRequest();
		realSubject.request();
		postRequest();
	}
	
	public void postRequest() {
		System.out.println("Cleaning...");
	}

}

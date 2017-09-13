package com.lex.mylab.designpattern.proxy;

public class TestProxy {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Subject sub = new Proxy();
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		sub.request();
		long done = System.currentTimeMillis();
		System.out.println(done - end);
	}
}

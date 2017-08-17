package com.lex.mylab.sessiondemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplicationContext {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationCar.class);
		Car bugatti = ctx.getBean("supercar", Car.class);
		bugatti.showDetails();
	}

}

package com.lex.mylab.sessiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApplicationContextFactory {

	public static void main (String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Car enzo = ctx.getBean("veryexpensiveCar", Car.class);
		enzo.showDetails();
	}
}

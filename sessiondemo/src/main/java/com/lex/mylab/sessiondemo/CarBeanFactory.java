package com.lex.mylab.sessiondemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class CarBeanFactory {
	
	public static void main(String[] args) {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource res = resolver.getResource("classpath:beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Car enzo = factory.getBean("veryexpensiveCar", Car.class);
		enzo.showDetails();
	}

}
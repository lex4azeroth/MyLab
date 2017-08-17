package com.lex.mylab.sessiondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.lex.mylab.sessiondemo.Car;

public class CarTest {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Car benz = newCarAsNormal();
		benz.showDetails();
		Car bmw = newCarWithReflect("BMW", "red", "1000$");
		bmw.showDetails();
		
		Car benz2 = newCarWithReflect("Benz", "black", "1500$");
		benz2.showDetails();
		
		if (benz == benz2) {
			System.out.println("Not possible");
		} else {
			System.out.println("Benz and Benz2 are not the same instance.");
		}
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		System.out.println("current loader " + loader);
		System.out.println("parent loader " + loader.getParent());
		System.out.println("grand loader " + loader.getParent().getParent());
	}
	
	public static Car newCarAsNormal() {
		Car car = new Car("Benz", "black");
		car.setPrice("1500$");
		return car;
	}
	
	public static Car newCarWithReflect(String brand, String color, String price) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Class clazz = loader.loadClass("com.lex.mylab.sessiondemo.Car");
		
		Class[] paramTypes = {String.class, String.class};
		Constructor constructor = clazz.getDeclaredConstructor(paramTypes);
		Car car = (Car) constructor.newInstance(brand, color);
//		Car car = (Car) clazz.newInstance();
		
		Class[] methodParamTypes = {String.class};
		
		Method method = clazz.getMethod("setPrice", methodParamTypes);
		method.invoke(car, price);
		return car;
	}

}


package com.lex.mylab.sessiondemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationCar {

	@Bean(name="supercar")
	public Car buildCar() {
		Car superCar = new Car("Bugatti Veyron", "Sliver");
		superCar.setPrice("50000000$");
		return superCar;
	}
}

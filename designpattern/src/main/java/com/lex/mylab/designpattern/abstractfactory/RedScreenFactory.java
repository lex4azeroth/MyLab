package com.lex.mylab.designpattern.abstractfactory;

public class RedScreenFactory implements ControlFactory {

	public Button newButton() {
		return new RedButton();
	}

	public TextField newTextField() {
		return new RedTextField();
	}

}

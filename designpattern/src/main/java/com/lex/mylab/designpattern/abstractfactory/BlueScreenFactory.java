package com.lex.mylab.designpattern.abstractfactory;

public class BlueScreenFactory implements ControlFactory {

	public Button newButton() {
		// TODO Auto-generated method stub
		return new BlueButton();
	}

	public TextField newTextField() {
		// TODO Auto-generated method stub
		return new BlueTextField();
	}

}

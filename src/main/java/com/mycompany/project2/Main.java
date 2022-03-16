package com.mycompany.project2;

public class Main {
	public static void main(String[] args) {
		BasicControl s3 = new BasicControl(new Radio());
		AdvanceControl s4 = new AdvanceControl(new TV());
		s3.turnOn();
		s3.changeChannel(5);
		s3.changeChannel(55);
		s3.turnOff();

		s4.turnOn();
		s4.changeChannel(5);
		s4.changeChannel(55);
		s4.turnOff();
	}
}
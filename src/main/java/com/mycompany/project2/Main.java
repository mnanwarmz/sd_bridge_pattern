package com.mycompany.project2;

public class Main {
	public static void main(String[] args) {
		BasicControl s3 = new BasicControl(new Radio());

		s3.turnOn();
		s3.changeChannel(5);
		s3.changeChannel(55);
		s3.turnOff();
	}
}
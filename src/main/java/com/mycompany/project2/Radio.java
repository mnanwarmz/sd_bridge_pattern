package com.mycompany.project2;

public class Radio implements Device {

	public void on() {
		System.out.println("Radio is turned on.");
	}

	public void off() {
		System.out.println("Radio is turned off.");
	}

	public int switchChannel(int channel) {
		return channel;
	}

	public int soundUp(int volume) {
		return volume;
	}
}
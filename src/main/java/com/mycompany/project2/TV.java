package com.mycompany.project2;

public class TV implements Device {
	public void on() {
		System.out.println("TV is turned on.");
	}

	public void off() {
		System.out.println("TV is turned off.");
	}

	public int switchChannel(int channel) {
		return channel;
	}

	public int soundUp(int volume) {
		return volume;
	}
}
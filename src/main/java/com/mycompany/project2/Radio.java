package com.mycompany.project2;

public class Radio implements Device {

	public void on() {
		System.out.println("Radio is turned on.");
	}

	public void off() {
		System.out.println("Radio is turned off.");
	}

	public int switchChannel(int channel) {
		System.out.println("You are listening to channel " + channel + " Now");
		return channel;
	}

	public int soundUp(int volume) {
		System.out.println("You are listening with a volume of " + volume + " Now");
		return volume;
	}
}
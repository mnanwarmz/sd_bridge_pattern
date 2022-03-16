package com.mycompany.project2;

public abstract class Control {

	private Device device;

	public Control(Device device) {
		this.device = device;
	}

	public void turnOn() {
		device.on();

	}

	public void turnOff() {
		device.off();
	}

	public int setChannel(int channel) {
		return device.switchChannel(channel);
	}

	public int setSound(int volume) {
		return device.soundUp(volume);
	}
}
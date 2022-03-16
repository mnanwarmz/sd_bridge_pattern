package com.mycompany.project2;

public class AdvanceControl extends Control {

	public AdvanceControl(Device device) {
		super(device);
	}

	public int changeChannel(int channel) {
		System.out.println("***you Changed to Channel " + channel + " Using AdvanceControl");
		return this.setChannel(channel);
	}

	public int changeSound(int volume) {
		System.out.println("***you Changed to Volume " + volume + " Using AdvanceControl");
		return this.setSound(volume);
	}
}
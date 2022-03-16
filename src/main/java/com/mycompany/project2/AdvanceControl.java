package com.mycompany.project2;

public class AdvanceControl extends Control {

	public AdvanceControl(Device device) {
		super(device);
	}

	public int changeChannel(int channel) {
		System.out.println("***you Changed to Channel " + channel + " Using AdvanceControl");
		System.out.println("You are watching channel " + channel + " Now");
		return this.setChannel(channel);
	}

	public int changeSound(int volume) {
		System.out.println("***you Changed to Volume " + volume + " Using AdvanceControl");
		System.out.println("You are listening with a volume of " + volume + " Now");
		return this.setSound(volume);
	}
}
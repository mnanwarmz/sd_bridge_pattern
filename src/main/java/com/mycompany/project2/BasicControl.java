package com.mycompany.project2;

public class BasicControl extends Control {

	public BasicControl(Device device) {
		super(device);
	}

	public int changeChannel(int channel) {
		System.out.println("***you Changed to Channel " + channel + " Using BasicControl");
		System.out.println("You are listening to channel" + channel + " Now");
		return this.setChannel(channel);
	}
}
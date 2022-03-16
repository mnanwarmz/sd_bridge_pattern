package com.mycompany.project2;

public class Main {
	public static void main(String[] args) {
		TV s0 = new TV();
		s0.on();
		s0.switchChannel(10);
		s0.switchChannel(3);
		s0.off();
		System.out.println(" *************");
		Radio s1 = new Radio();
		s1.on();
		s1.switchChannel(4);
		s1.switchChannel(9);
		s1.off();
	}
}
package com.something.hm2.DevicePart4;

public class Microwave extends Device {

	public Microwave(String name, int age, boolean isWorking) {
		super(name, age, isWorking);
	}

	public void sound() {
		System.out.println("The microwave is beeping...");
	}

	public void show() {
		System.out.println("The microwave is " + getName());
	}

	public void desc() {
		System.out.println("The microwave is a kitchen appliance used for heating food.");
	}

}
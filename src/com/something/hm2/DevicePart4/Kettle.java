package com.something.hm2.DevicePart4;

public class Kettle extends Device {

	public Kettle(String name, int age, boolean isWorking) {
		super(name, age, isWorking);
	}

	public void sound() {
		System.out.println("The kettle is whistling...");
	}

	public void show() {
		System.out.println("The kettle is " + getName());
	}

	public void desc() {
		System.out.println("The kettle is an electric kettle used for boiling water.");
	}

}
package com.something.hm2.MusicThingsPart5;

public class Trombone extends MusicDevice {

	public Trombone(String brand, int volumeLevel) {
		super(brand, volumeLevel);
	}

	public void desc() {
		System.out.println("Trombone - a musical instrument");
	}

	public void history() {
		System.out.println("History of Trombone");
	}

	public void sound() {
		System.out.println("Trombone sound");
	}

	public void show() {
		System.out.println("Trombone: " + brand);
	}
	
}
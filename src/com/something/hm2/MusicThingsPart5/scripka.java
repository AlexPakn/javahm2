package com.something.hm2.MusicThingsPart5;

public class scripka extends MusicDevice {

    public scripka(String brand, int volume) {
        super(brand, volume);
    }

    public void show() {
        System.out.println("scripka: " + brand);
    }

    public void desc() {
        System.out.println("scripka - a musical instrument");
    }

    public void history() {
        System.out.println("History of scripka");
    }

    public void sound() {
        System.out.println("scripka sound");
    }

}
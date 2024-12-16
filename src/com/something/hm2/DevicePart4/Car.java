package com.something.hm2.DevicePart4;

public class Car extends Device {

    public Car(String name, int age, boolean isWorking) {
        super(name, age, isWorking);
    }

    public void sound() {
        System.out.println("The car is honking...");
    }

    public void show() {
        System.out.println("The car is " + getName());
    }

    public void desc() {
        System.out.println("The car is a vehicle used for transportation.");
    }
}
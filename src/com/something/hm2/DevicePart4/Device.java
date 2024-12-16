package com.something.hm2.DevicePart4;

public class Device {

    protected String name;
    protected int age;
    protected boolean isWorking;

    public Device(String name, int age, boolean isWorking) {
        this.name = name;
        this.age = age;
        this.isWorking = isWorking;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}
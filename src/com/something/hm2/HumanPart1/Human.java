package com.something.hm2.HumanPart1;

public class Human {
    private String name;
    private String surname;
    private int age;
    private double height;
    private double weight;

    public Human(String name, String surname, int age, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
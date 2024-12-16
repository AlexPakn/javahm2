package com.something.hm2.HumanPart1;

public class Sailor extends Human {
    private String ship;
    private int yearsAtSea;

    public Sailor(String name, String surname, int age, double height, double weight, String ship,
        int yearsAtSea) {
        super(name, surname, age, height, weight);
        this.ship = ship;
        this.yearsAtSea = yearsAtSea;
    }

    public String getShip() {
        return ship;
    }

    public int getYearsAtSea() {
        return yearsAtSea;
    }
}
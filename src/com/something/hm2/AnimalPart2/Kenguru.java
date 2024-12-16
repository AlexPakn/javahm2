package com.something.hm2.AnimalPart2;

public class Kenguru extends Animal {
    private String kenguruDescription;

    public Kenguru(String name, int age, String kenguruDescription) {
        super(name, age);
        this.kenguruDescription = kenguruDescription;
    }

    public String getKenguruDescription() {
        return kenguruDescription;
    }

    public void setKenguruDescription(String kenguruDescription) {
        this.kenguruDescription = kenguruDescription;
    }
}
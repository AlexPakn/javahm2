package com.something.hm2.AnimalPart2;

public class croco extends Animal {
    private String crocoDescription;

    public croco(String name, int age, String crocoDescription) {
        super(name, age);
        this.crocoDescription = crocoDescription;
    }

    public String getCrocoDescription() {
        return crocoDescription;
    }

    public void setCrocoDescription(String crocoDescription) {
        this.crocoDescription = crocoDescription;
    }
}
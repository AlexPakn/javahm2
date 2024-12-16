package com.something.hm2.AnimalPart2;

public class Tigre extends Animal {
    private String tigreDescription;

    public Tigre() {
        super("Tigre", 4);
        this.tigreDescription = "fluffy guy";
    }

    public String getTigreDescription() {
        return tigreDescription;
    }

    public void setTigreDescription(String tigreDescription) {
        this.tigreDescription = tigreDescription;
    }
}
package com.something.hm2.HumanPart1;

public class Pilot extends Human {
    private String aircraftType;
    private int flightHours;

    public Pilot(String name, String surname, int age, double height, double weight,
        String aircraftType, int flightHours) {
        super(name, surname, age, height, weight);
        this.aircraftType = aircraftType;
        this.flightHours = flightHours;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }
}
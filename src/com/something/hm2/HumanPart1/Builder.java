package com.something.hm2.HumanPart1;

public class Builder extends Human {
  private String specialty;
  private int yearsOfExperience;
  private boolean licensed;

  public Builder(String name, String surname, int age, double height, double weight, String specialty, int yearsOfExperience, boolean licensed) {
    super(name, surname, age, height, weight);
    this.specialty = specialty;
    this.yearsOfExperience = yearsOfExperience;
    this.licensed = licensed;
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  public boolean isLicensed() {
    return licensed;
  }

  public void setLicensed(boolean licensed) {
    this.licensed = licensed;
  }
}
package com.something.hm2;

import com.something.hm2.AnimalPart2.Animal;
import com.something.hm2.AnimalPart2.Kenguru;
import com.something.hm2.AnimalPart2.croco;
import com.something.hm2.DevicePart4.Car;
import com.something.hm2.DevicePart4.Device;
import com.something.hm2.DevicePart4.Kettle;
import com.something.hm2.DevicePart4.Microwave;
import com.something.hm2.HumanPart1.Builder;
import com.something.hm2.HumanPart1.Human;
import com.something.hm2.HumanPart1.Sailor;
import com.something.hm2.MathPart67.Array;
import com.something.hm2.MathPart67.IMath;
import com.something.hm2.MathPart67.ISort;
import com.something.hm2.MoneyPart3.Money;
import com.something.hm2.MoneyPart3.Product;
import com.something.hm2.MusicThingsPart5.Trombone;
import com.something.hm2.MusicThingsPart5.scripka;

public class Main {

  public static void main(String[] args) {
    testHuman();
    testAnimal();
    testMoney();
    testDevice();
    testMusickDevice();
    testArray();
    testIMath();
  }

  public static void testHuman() {
    // Test Human class
    Human human = new Human("John", "Doe",
        30, 5.9, 165.0);
    System.out.println("Human Name: " + human.getName());
    System.out.println("Human Surname: " + human.getSurname());
    System.out.println("Human Age: " + human.getAge());
    System.out.println("Human Height: " + human.getHeight());
    System.out.println("Human Weight: " + human.getWeight());

    // Test Builder class
    Builder builder = new Builder("Jane","Smith",
        28, 5.7, 150.0, "Carpenter", 5, true);
    System.out.println("Builder Specialty: " + builder.getSpecialty());
    System.out.println("Builder Years of Experience: " + builder.getYearsOfExperience());
    System.out.println("Builder Licensed: " + builder.isLicensed());

    // Test Sailor class
    Sailor sailor = new Sailor("Jack",
        "Sparrow", 40, 6.0, 180.0, "Black Pearl", 20);
    System.out.println("Sailor Ship: " + sailor.getShip());
    System.out.println("Sailor Years at Sea: " + sailor.getYearsAtSea());
  }

  public static void testAnimal() {
    // Test Animal class
    Animal animal = new Animal("Animal", 5);
    System.out.println("Animal Name: " + animal.getName());
    System.out.println("Animal Age: " + animal.getAge());
    // Test Animal subclasses
    Kenguru kenguru = new Kenguru("Kenguru", 10, "Kenguru description");
    System.out.println("Kenguru description: " + kenguru.getKenguruDescription());
    croco croco = new croco("Croco", 15, "Croco description");
    System.out.println("Croco description: " + croco.getCrocoDescription());
  }

  public static void testMoney() {
    // Test Money class
    Money money = new Money(100, 50);
    System.out.println("Money: " + money.toString());
    // Test Product class
    Product product = new Product("Milk", 50, 50);
    System.out.println("Product Name: " + product.getName());
    System.out.println("Product Price: " + product.toString());
  }

  public static void testDevice() {
    // Test Device class
    Device device = new Device("Device", 10, true);
    System.out.println("Device Name: " + device.getName());
    System.out.println("Device Age: " + device.getAge());
    System.out.println("Device isWorking: " + device.isWorking());
    // Test Device subclasses
    Kettle kettle = new Kettle("Kettle", 20, true);
    kettle.sound();
    kettle.show();
    kettle.desc();
    Microwave microwave = new Microwave("Microwave", 30, true);
    microwave.sound();
    microwave.show();
    microwave.desc();
    Car car = new Car("Microwave", 28, true);
    car.sound();
    car.show();
    car.desc();
  }

  public static void testMusickDevice() {
    scripka scripka = new scripka("scripka", 20);
    scripka.show();
    scripka.desc();
    scripka.history();
    scripka.sound();
    Trombone trombone = new Trombone("Trombone", 25);
    trombone.show();
    trombone.desc();
    trombone.history();
    trombone.sound();
  }

  public static void testArray() {
    int[] array = {1, 2, 3, 4, 5};
    ISort arr = new Array(array);
    arr.SortAsc();
    arr.SortDesc();
  }

  public static void testIMath() {
    IMath math = new Array();
    System.out.println("max: " + math.Max(3, 5));
    System.out.println("min: " + math.Min(3, 5));
    System.out.println("avg: " + math.Avg(3, 5));
  }
}
package com.octavian.classesandobjects.autoservicetask;

public class Car {
    int km;
    String gearType;
    String name;
    String model;
    int year;
    double carPrice;
    String fuelType;

    Car(String nameParametruDeIntrare, String modeldeintrare, int year, String fuelType) {
        this.name = nameParametruDeIntrare;
        this.model = modeldeintrare;
        this.year = year;
        this.fuelType = fuelType;
        System.out.println("In urma executiei acestui constructor 4 parametri care creeza un nou obiect despre care nu " +
                "se cunoaste price, gearType,km");

    }


    }


package com.octavian.accesmodifiers.peopleevidence;

import java.security.PrivateKey;

public class Person {

    public static int numartotaldepersoane;

    private long cnp;
    public String name;
    public String gender;
    public String surname;
    public String address;
    protected String phone;
    double height;
    String eyeColor;
    double weight;
    String education;
    String nationality;
    public boolean isMarried;
    String readingBook;
    String mailAddress;
    String occupation;
    private int age;

    public Person(long cnp, String name, boolean isMarried, int age) {
        this.cnp = cnp;
        this.name = name;
        this.isMarried = isMarried;
        this.age = age;

    }

    public Person(long cnpobligotariu) {
        cnp = cnpobligotariu;
        numartotaldepersoane++;
    }
}


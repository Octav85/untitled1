package com.octavian.accesmodifiers.peopleevidence;

import java.security.PrivateKey;

public class Person {

    public static int numartotaldepersoane;

    private final long cnp;
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
    boolean isMarried;
    String readingBook;
    String mailAddress;
    String occupation;
    private int age;

    public Person(long cnp, String name, boolean isMarried, int age) {
        this.cnp = cnp;
        this.name = name;
        this.isMarried = isMarried;
        this.age = age;

    public Person( long cnpobligotariu){
            cnp = cnpobligotariu;
            numartotaldepersoane++;
        }
    }

    public void setAge(int inputage) {
        if (inputage > 0) {
            if (inputage < 128)
                this.age = inputage;
        } else {
            System.out.println("age exceeded");
        }else{
            System.out.println("age cannot be 0");
        }

        this.age = inputage;
    }
}
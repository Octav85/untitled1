package com.octavian.zooclub;

import java.sql.SQLOutput;

public class Dog extends Animal implements TrailInterface {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eats pedigree");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes woof");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " sleeps in the morning");
    }


}

package com.octavian.zooclub;

public class Cat extends Animal implements  TrailInterface {

    public Cat(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(getName() + "eat whiskas");
    }

    public void makeSound() {
        System.out.println(getName() + " makes meow");
    }

    public void sleep() {
        System.out.println(this.getName() + "during the day");
    }
}

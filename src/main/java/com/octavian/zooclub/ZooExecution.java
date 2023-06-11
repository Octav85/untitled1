package com.octavian.zooclub;

public class ZooExecution {
    public static void main(String[] args) {
        Animal CharlieDog = new Dog("Charlie");

        System.out.println("numele obiectului este:" + CharlieDog.getName());
        CharlieDog.setName("Charlie goodboy");
        System.out.println("numele actualizat al obiectului este:" + CharlieDog.getName());
        CharlieDog.eat();

        AnimalInterface rexDog = new Dog("Rex");
        rexDog.makeSound();

        Dog grivei = new Dog("Grivei");
        grivei.eat();
        grivei.sleep();
        grivei.makeSound();


    }
}

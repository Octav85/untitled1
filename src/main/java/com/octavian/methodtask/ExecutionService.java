package com.octavian.methodtask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(10, 9999);
        System.out.println("Variabila este " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila este " + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000);
        System.out.println("Variabila double " + randomDouble);

        System.out.println("random boolean" + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random mail 1" + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random mail 2" + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random strings de X char " + DataGeneratorUtil.genaraterandomString(5));

        Customer ionConsumer = new Customer("Ion", 25, "ion@gmail.com");

        System.out.println("nume obiect " + ionConsumer.getName());

        System.out.println(" virsta " + ionConsumer.getAge());

        System.out.println(" email " + ionConsumer.getEmail());

        ionConsumer.setName("Ion Brotacel");

        System.out.println("nume obiect " + ionConsumer.getName());

        System.out.println(" virsta " + ionConsumer.getAge());

        System.out.println(" email " + ionConsumer.getEmail());

        Customer randomCustomer = new Customer(DataGeneratorUtil.genaraterandomString(12), DataGeneratorUtil.getRandomInt(102)
                , DataGeneratorUtil.getRandomEmail());

        System.out.println(randomCustomer.toString());


    }


}

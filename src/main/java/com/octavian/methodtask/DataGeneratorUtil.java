package com.octavian.methodtask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random random = new Random();

    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("Valoarea minima trebuie sa fie mai mica decat cea maxima");
            return 0;
        }
        int delta = max - min;
        int randomDelta = random.nextInt(delta);
        int randomNumber = randomDelta + min;
        return randomNumber;
    }

    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }

    public static double getRandomDouble(double limit) {
        if (limit <= 0) {
            System.out.println("numarul nu trebuie sa fie mai mic decate 0");
            return 0;
        }
        return random.nextDouble() * limit;
    }

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public static String getRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        String domain = "@mailnator.com";
        return uuid + domain;
    }

    public static String genaraterandomString(int length){
        String acceptedChar = ("ABCDEFGHIJKLMNQOPRSTUVYWZXdasdkhfkldfpwqoutituietyu0123456789");
        StringBuilder stringBuilder= new StringBuilder();
        for (int i = 0; i < length; i ++){
            int randomIndex = getRandomInt(0,acceptedChar.length());
            stringBuilder.append(acceptedChar.charAt(randomIndex));
            System.out.println("in iteratia: i " + i + "caracterul alipit este " + acceptedChar.charAt(randomIndex));
        }
      return stringBuilder.toString();
    }
}


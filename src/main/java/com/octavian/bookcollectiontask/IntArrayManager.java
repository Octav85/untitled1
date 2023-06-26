package com.octavian.bookcollectiontask;

public class IntArrayManager {
    public static int getMinValueOfArray(int[] intArray) {
        int minValue = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];

            }
        }
        return minValue;
    }

    public static int getMinValueInedxOfArray(int[] intArray) {
        int minValue = intArray[0];
        int index = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
                index = i;


            }
        }
        return index;
    }

    public static int getAverageOfArray(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
            }

        return sum /intArray.length;
    }
}

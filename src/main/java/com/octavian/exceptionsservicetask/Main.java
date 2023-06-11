package com.octavian.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result = ArithmeticOperations.divideIntWithExceptionHandling(81, 9);
        System.out.println(result);
        System.out.println("The program is running till the end");

        String stringValue1 = "Gheorghe" ;
        String stringValue2 = null;
        System.out.println(TextManager.getTextLengthWithTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTextLength(stringValue1));


        String filepath = "src/main/java/com/octavian/exceptionsservicetask/text.txt" ;
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filepath);
        } catch (IOException exceptionObject){
            System.out.println("The file doesn't exist");
        }finally {
            System.out.println("always executed");
        }
        System.out.println("program is running");

        ReadDataManager.readDataFromFileWitTryAndCatch(filepath);
    }
}

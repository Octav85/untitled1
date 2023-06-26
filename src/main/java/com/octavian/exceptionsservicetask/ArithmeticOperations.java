package com.octavian.exceptionsservicetask;

public class ArithmeticOperations {
    public static int divideIntNoExceptionHandling(int a, int b) {
        return a / b;
    }

    public static int divideIntWithExceptionHandling(int a, int b) {
        try{
            int result = a / b;
            return result;
        } catch (Exception capturedException){
            System.out.println("An exeption has occured" + capturedException.getMessage() );
            return 0;

        }
    }
}

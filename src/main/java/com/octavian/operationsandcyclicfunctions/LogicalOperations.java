package com.octavian.operationsandcyclicfunctions;

public class LogicalOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean result = a && b;
        System.out.println("Logic and:" + result);

        result = a || b;
        System.out.println("Logic or:" + result);

        System.out.println( "Negation: " + !result);
    }
}

package com.octavian.operationsandcyclicfunctions;

public class GradeSystem {
    public static void main(String[] args) {
        int testResult = 76;

        if (testResult >= 90) {
            System.out.println("calificativul A");

        } else if (testResult >= 80) {
            System.out.println("calificativul este B");
        } else if (testResult >=70 ) {
            System.out.println("calificativul este C");

        } else {
            System.out.println("nu este definit");
        }
    }
}

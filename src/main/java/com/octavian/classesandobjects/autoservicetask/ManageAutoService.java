package com.octavian.classesandobjects.autoservicetask;

import javax.xml.namespace.QName;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage garajulLuiAndrei = new Garage("Lunca Bicului", 133);
        System.out.println("adresa lui andrei este " + garajulLuiAndrei.address);
        garajulLuiAndrei.hasComputerDiagnostics = true;
        garajulLuiAndrei.numberID = "45477" ;
        garajulLuiAndrei.scheduler = "uneori" ;

        System.out.println("Garajul lui andrei are urmatoarele proprietati: Adresa: " + garajulLuiAndrei.address + ", Capaci" +
                "tatea:" + garajulLuiAndrei.carCapacity);


        Garage garajulLuiGheorghe = new Garage("Lunca Prutului", 345);
        System.out.println("adresa lui gheorghe este " + garajulLuiGheorghe.address);

        Car masinaLuiOctavian = new Car("Mercedes", "gx800", 1997, "disel");
        System.out.println("Masina lui Octavian este: " + masinaLuiOctavian.name + ", modelul: " + masinaLuiOctavian.model +
                ", anul de fabricare:" + masinaLuiOctavian.year);
        Tool elevatorTool = new Tool(154444);


    }
}
package com.octavian.accesmodifiers;

import com.octavian.accesmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person octavianPlopa = new Person(4654412212L);
        System.out.println("codul personal a lui" + octavianPlopa.name);

        Person marianaOleinic = new Person(45244414L, "Mariana", false, 28);
        System.out.println(marianaOleinic.isMarried + "CNP este" + marianaOleinic.gender);

    }
}

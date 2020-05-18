package com.codersbay;

import java.util.ArrayList;
import java.util.List;

import static com.codersbay.PersonManagement.*;

public class Main {

    public static void main(String[] args) {

        for (Person person : PERSONS) {
            System.out.println(person.toString());
        }
        System.out.println(1);

        addPerson("Max", "Mustermann", 105, true);
        addPerson("Franziska", "Just", 21, false, "Kauderweg 7", true);
        addPerson("Bobo", "Fraudolence", 57, true, "Kuderwurzweg 23", false);

        for (Person person : PERSONS) {
            System.out.println(person.toString());
        }

        System.out.println(2);

        removePerson("Max", "Mustermann", 105, true);

        for (Person person : PERSONS) {
            System.out.println(person.toString());
        }

    }
}
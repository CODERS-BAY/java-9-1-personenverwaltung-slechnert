package com.codersbay;

import java.util.ArrayList;
import java.util.List;

import static com.codersbay.PersonManagement.*;

public class Main {

    public static void main(String[] args) {

        PersonManagement.printPersons();
        System.out.println(1);

        addPerson("Max", "Mustermann", 105, true, "Endless Sleep Alley 8", true);
        addPerson("Franziska", "Just", 21, false, "Kauderweg 7", true);
        addPerson("Bobo", "Fraudolence", 57, true, "Kuderwurzweg 23", false);

        PersonManagement.printPersons();
        System.out.println(2);

        removePerson("Max", "Mustermann", 105, true, "Endless Sleep Alley 8", true);

        PersonManagement.printPersons();

    }
}
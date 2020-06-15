package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class PersonManagement {
    static private List<Person> PERSONS = new ArrayList();


    private static void addPerson(String firstName, String lastName, Integer age) {
        PERSONS.add(new Person(firstName, lastName, age));
    }

    public static void addPerson(String firstName, String lastName, Integer age, Boolean isMale) {
        PERSONS.add(new Person(firstName, lastName, age, isMale));
    }

    public static void addPerson(String firstName, String lastName, Boolean isMale) {
        PERSONS.add(new Person(firstName, lastName, isMale));
    }

    public static void addPerson(String firstName, String lastName, Integer age, Boolean isMale, String address) {
        PERSONS.add(new Person(firstName, lastName, age, isMale, address));
    }

    public static void addPerson(String firstName, String lastName, Integer age, Boolean isMale, String address, Boolean isHealthy) {
        PERSONS.add(new Person(firstName, lastName, age, isMale, address, isHealthy));
    }


    private static void removePerson(String firstName, String lastName, Integer age) {
        PERSONS.remove(new Person(firstName, lastName, age));
    }

    public static void removePerson(String firstName, String lastName, Integer age, Boolean isMale) {
        PERSONS.remove(new Person(firstName, lastName, age, isMale));
    }

    public static void removePerson(String firstName, String lastName, Boolean isMale) {
        PERSONS.remove(new Person(firstName, lastName, isMale));
    }

    public static void removePerson(String firstName, String lastName, Integer age, Boolean isMale, String address) {
        PERSONS.remove(new Person(firstName, lastName, age, isMale, address));
    }

    public static void removePerson(String firstName, String lastName, Integer age, Boolean isMale, String address, Boolean isHealthy) {
        PERSONS.remove(new Person(firstName, lastName, age, isMale, address, isHealthy));
    }

    static void printPersons() {
        for (Person p : PERSONS) {
            System.out.println(p.toString());
        }
    }
}


  /*  public Person(String firstName, String lastName, Integer age, Boolean isMale, String address, Boolean isHealthy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
        this.address = address;
        this.isHealthy = isHealthy; */
package com.codersbay;

import static com.codersbay.PersonManagement.PERSONS;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean isMale;
    private String address;
    private Boolean isHealthy;


    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, Integer age, Boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }

    public Person(String firstName, String lastName, Integer age, Boolean isMale, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
        this.address = address;
    }

    public Person(String firstName, String lastName, Boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMale = isMale;
    }

    public Person(String firstName, String lastName, Integer age, Boolean isMale, String address, Boolean isHealthy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
        this.address = address;
        this.isHealthy = isHealthy;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Person other = (Person) obj;

        return (other.firstName.equals(this.firstName) &&
                other.lastName.equals(this.lastName) &&
                other.age.equals(this.age) &&
                other.isMale == this.isMale &&
                other.address.equals(this.address) &&
                other.isHealthy == this.isHealthy);
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", address='" + address + '\'' +
                ", isHealthy=" + isHealthy +
                '}';
    }
}



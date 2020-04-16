package com.example.retrofittutorialpart1.model;

public class Employee {
    private String mFirstName;
    private int mAge;
    private String mGail;

    public Employee(String firstName, int age, String mail) {
        this.mFirstName = firstName;
        this.mAge = age;
        this.mGail = mail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "mFirstName='" + mFirstName + '\'' +
                ", mAge=" + mAge +
                ", mGail='" + mGail + '\'' +
                '}';
    }
}

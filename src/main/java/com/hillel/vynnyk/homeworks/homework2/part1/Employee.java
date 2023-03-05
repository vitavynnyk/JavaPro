package com.hillel.vynnyk.homeworks.homework2.part1;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public Employee(String firstName, String lastName,
                    String position, String email, String phoneNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}

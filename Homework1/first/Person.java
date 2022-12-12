package Homework1.first;

import java.sql.SQLOutput;

public class Person {
    private String fullName;
    private int age;


    public Person(String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;


    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String move() {
        return "The person can run";
    }

    public String talk() {
        return "The person can speak English";
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.zipcodewilmington.anthropoid; 

/**
 * Created by leon on 5/1/17.
 */
public class Person {
    private  String name;
    private  Boolean isFemale;
    private  Integer age;

    public Person(String name, int age, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
        this.age = age;
    }

	public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isFemale() {
        return isFemale;
    }
}

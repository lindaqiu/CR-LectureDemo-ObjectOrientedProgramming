package com.zipcodewilmington.anthropoid;

import com.zipcodewilmington.tools.RandomUtils;
import com.zipcodewilmington.tools.StringUtils;

/**
 * Created by leon on 5/1/17.
 */
public class PersonFactory {
    private PersonFactory() {
        /** this class cannot be instantiated */
    }

    
    // factory method
    public static Person createRandomPerson() {
        String randomString = RandomUtils.createString('a', 'z', 10);
        String name = StringUtils.capitalizeFirstChar(randomString);
        int age = RandomUtils.createInteger(0, 100);
        boolean isMale = RandomUtils.createBoolean(50);

        Person randomPerson = new Person(name, age, isMale);
        PersonWarehouse.addPerson(randomPerson);
        return randomPerson;
    }
    
    
    
    public static Person[] createRandomPerson(int arrayLength) {
        Person[] people = new Person[arrayLength];
        int currentIndex = 0;
        while(currentIndex < people.length) {
            people[currentIndex] = createRandomPerson();
            currentIndex++;
        }
        return people;
    }
}
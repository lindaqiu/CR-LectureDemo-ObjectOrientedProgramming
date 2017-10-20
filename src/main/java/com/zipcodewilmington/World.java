package com.zipcodewilmington;

import com.zipcodewilmington.anthropoid.Person;
import com.zipcodewilmington.anthropoid.PersonHandler;
import com.zipcodewilmington.anthropoid.PersonFactory;
import com.zipcodewilmington.anthropoid.PersonWarehouse;

/**
 * Created by leon on 6/24/17.
 */ // TODO Do this
public class World {
    public static void main(String[] args) {
        PersonFactory.createRandomPerson();

        Person[] people = PersonWarehouse.getPeople();

        int currentIndex = 0;
        while(currentIndex < people.length) {
            Person currentPerson = people[currentIndex];
            PersonHandler personDecorator = new PersonHandler(currentPerson);
            System.out.println(personDecorator.sayAge());
            currentIndex++;
        }
    }
}

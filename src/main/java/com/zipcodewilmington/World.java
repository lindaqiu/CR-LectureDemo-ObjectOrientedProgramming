package com.zipcodewilmington;

import com.zipcodewilmington.anthropoid.Person;
import com.zipcodewilmington.anthropoid.PersonDecorator;
import com.zipcodewilmington.anthropoid.PersonFactory;
import com.zipcodewilmington.anthropoid.PersonWarehouse;

/**
 * Created by leon on 6/24/17.
 */ // TODO Do this
public class World {
	public static void main(String[] args) {
        //PersonFactory.createRandomPerson();
        //PersonFactory.createRandomPerson();
        //PersonFactory.createRandomPerson();
        //PersonFactory.createRandomPerson();
        PersonFactory.createRandomPerson();

        Person[] people = PersonWarehouse.getPeople();

        int currentIndex = 0;
        while(currentIndex < people.length) {
            Person currentPerson = people[currentIndex];
            PersonDecorator personDecorator = new PersonDecorator(currentPerson);
            System.out.println(personDecorator.sayAge());
            currentIndex++;
        }
    }
}

package com.zipcodewilmington.anthropoid;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Created by leon on 5/29/17. responsible for storing and retrieving
 */
public class PersonWarehouse {
	private static final Logger logger = Logger.getGlobal();
	private static final ArrayList<Person> people = new ArrayList<>();

	private PersonWarehouse() {
		/** this class cannot be instantiated */
	}

	public static void addPerson(Person person) {
		// logger.info("Registering a new Person object to the Person
		// warehouse...");
		System.out.println("Registering a new Person object to the Person warehouse...");
		people.add(person);
	}

	public static Person[] getPeople() {
		return people.stream().toArray(Person[]::new);
	}
}

package com.zipcodewilmington.anthropoid;
/**
 * Created by leon on 6/20/17.
 */
// TODO - Rename classs to PersonFacade
public class PersonHandler {
    private final Person person;

    public PersonHandler(Person person) {
        this.person = person;
    }

    public String say(String message) {
        String personName = this.person.getName();
        String outputMessage = personName + " says, '" + message + "'";
        return outputMessage;
    }

    public String sayAge() {
        int personAge = this.person.getAge();
        String spokenPhrase = "I am " + personAge + " years old.";
        return say(spokenPhrase);
    }

}

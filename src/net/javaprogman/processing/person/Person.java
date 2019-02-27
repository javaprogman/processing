package net.javaprogman.processing.person;

public abstract class Person {


    private String firsName;
    private String lastName;
    private String Name;

    Person (String firsName, String lastName){
        this.firsName = firsName;
        this.lastName = lastName;
        this.Name = firsName + " " + lastName;
    }

    public String getName() {
        return Name = firsName + " " + lastName;
    }

}


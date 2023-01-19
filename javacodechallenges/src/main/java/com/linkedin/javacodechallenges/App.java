package com.linkedin.javacodechallenges;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("John David", "Cabal", 23);
        Person person2 = new Person("Jose", "baldwin", 40);
        Person person3 = new Person("Marichan", "gonzaga", 34);

        person1.introducePerson();
        person2.introducePerson();
        person3.introducePerson();
    }
}

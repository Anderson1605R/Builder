package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private String email;

    //Construtor privado para obrigar a utilização do builder
    private Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String email;


        public PersonBuilder firsName(String firsName) {
            this.firstName = firsName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, email);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
               "firsName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}

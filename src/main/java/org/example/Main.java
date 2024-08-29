package org.example;

public class Main {
    public static void main(String[] args) {
        Person anderson = new Person.PersonBuilder()
                .firsName("Anderson")
                .lastName("Rocha")
                .email("Anderson@Asasa")
                .build();

        System.out.println(anderson);

        // aqui é chamado o builder sem passar o último atributo e o valor dele é null
        Person pedro = new Person.PersonBuilder()
                .firsName("Pedro")
                .lastName("Rocha")
                .build();

        System.out.println(pedro);

    }

}
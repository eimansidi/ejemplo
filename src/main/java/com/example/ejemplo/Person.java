package com.example.ejemplo;

import java.time.LocalDate;

public class Person {
    private static int idCounter = 0; // Contador para generar IDs
    private final int id; // ID único
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.id = ++idCounter; // Incrementa y asigna el ID
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id; // Getter para el ID
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, %s %s (Born: %s)", id, firstName, lastName, birthDate);
    }
}

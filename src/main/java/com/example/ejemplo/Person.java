package com.example.ejemplo;

import java.time.LocalDate;

/**
 * Representa una persona con un ID único, nombre, apellido y fecha de nacimiento.
 */
public class Person {
    private static int idCounter = 0;
    private final int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    /**
     * Constructor para crear una nueva persona con nombre, apellido y fecha de nacimiento.
     * El ID se asigna automáticamente.
     */
    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.id = ++idCounter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    /**
     * Devuelve el ID único de la persona.
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre de la persona.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Establece el nombre de la persona.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Devuelve el apellido de la persona.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Establece el apellido de la persona.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Devuelve la fecha de nacimiento de la persona.
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Devuelve una representación en cadena de la persona con su ID, nombre, apellido y fecha de nacimiento.
     */
    @Override
    public String toString() {
        return String.format("ID: %d, %s %s (Born: %s)", id, firstName, lastName, birthDate);
    }
}

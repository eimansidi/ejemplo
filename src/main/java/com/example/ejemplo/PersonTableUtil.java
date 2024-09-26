package com.example.ejemplo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

/**
 * Utilidades para la tabla de personas, proporcionando métodos para crear columnas y listas de datos.
 */
public class PersonTableUtil {

    /**
     * Devuelve una lista observable de personas con datos predefinidos.
     */
    public static ObservableList<Person> getPersonList() {
        return FXCollections.observableArrayList(
                new Person("Ashwin", "Doe", LocalDate.of(2012, 10, 11)),
                new Person("Advik", "Sharan", LocalDate.of(2012, 10, 11)),
                new Person("Layne", "Estes", LocalDate.of(2011, 12, 16)),
                new Person("Mason", "Boyd", LocalDate.of(2003, 4, 20)),
                new Person("Babalu", "Sharan", LocalDate.of(1980, 1, 10))
        );
    }

    /**
     * Crea y devuelve la columna para el campo 'ID' de la tabla.
     */
    public static TableColumn<Person, String> getIdColumn() {
        TableColumn<Person, String> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        return idCol;
    }

    /**
     * Crea y devuelve la columna para el campo 'First Name' de la tabla.
     */
    public static TableColumn<Person, String> getFirstNameColumn() {
        TableColumn<Person, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        return firstNameCol;
    }

    /**
     * Crea y devuelve la columna para el campo 'Last Name' de la tabla.
     */
    public static TableColumn<Person, String> getLastNameColumn() {
        TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        return lastNameCol;
    }

    /**
     * Crea y devuelve la columna para el campo 'Birth Date' de la tabla.
     */
    public static TableColumn<Person, LocalDate> getBirthDateColumn() {
        TableColumn<Person, LocalDate> birthDateCol = new TableColumn<>("Birth Date");
        birthDateCol.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        return birthDateCol;
    }
}

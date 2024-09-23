package com.example.ejemplo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PersonTableUtil {

    // Devuelve una lista observable de personas de ejemplo
    public static ObservableList<Person> getPersonList() {
        return FXCollections.observableArrayList(
                new Person("Ashwin", "Sharan", LocalDate.of(2012, 10, 11)),
                new Person("Advik", "Sharan", LocalDate.of(2012, 10, 11)),
                new Person("Layne", "Estes", LocalDate.of(2011, 12, 16)),
                new Person("Mason", "Boyd", LocalDate.of(2003, 4, 20)),
                new Person("Babalu", "Sharan", LocalDate.of(1980, 1, 10))
        );
    }

    // Devuelve la columna ID
    public static TableColumn<Person, String> getIdColumn() {
        TableColumn<Person, String> idCol = new TableColumn<>("ID");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id")); // Suponiendo que hay un campo ID, pero si no existe, se puede eliminar
        return idCol;
    }

    // Devuelve la columna para el nombre
    public static TableColumn<Person, String> getFirstNameColumn() {
        TableColumn<Person, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        return firstNameCol;
    }

    // Devuelve la columna para el apellido
    public static TableColumn<Person, String> getLastNameColumn() {
        TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        return lastNameCol;
    }

    // Devuelve la columna para la fecha de nacimiento
    public static TableColumn<Person, LocalDate> getBirthDateColumn() {
        TableColumn<Person, LocalDate> birthDateCol = new TableColumn<>("Birth Date");
        birthDateCol.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        return birthDateCol;
    }
}

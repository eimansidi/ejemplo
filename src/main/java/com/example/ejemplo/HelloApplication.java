package com.example.ejemplo;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.example.ejemplo.Person;
import java.util.Arrays;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.HBox;
import static javafx.scene.control.TableView.TableViewSelectionModel;

/**
 * Clase principal de la aplicación JavaFX para agregar y eliminar filas de una tabla de personas.
 */
public class HelloApplication extends Application {
    private TextField fNameField;
    private TextField lNameField;
    private DatePicker dobField;
    private TableView<Person> table;

    /**
     * Método principal que inicia la aplicación.
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    /**
     * Configura la interfaz gráfica de la aplicación.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void start(Stage stage) {
        // Campos de texto para el nombre y apellido
        fNameField = new TextField();
        lNameField = new TextField();

        // Campo para seleccionar la fecha de nacimiento
        dobField = new DatePicker();

        // Configuración inicial de la tabla de personas
        table = new TableView<>();

        // Agregar un botón para añadir personas
        Button addButton = new Button("Agregar");

        // Configuración del layout y la escena
        GridPane form = new GridPane();
        VBox layout = new VBox();
        layout.getChildren().addAll(form, addButton, table);

        // Crear y mostrar la escena principal
        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Añade una nueva persona a la tabla con los datos ingresados.
     */
    private void addPerson() {
        // Obtener datos de los campos de texto
        String firstName = fNameField.getText();
        String lastName = lNameField.getText();

        // Crear nueva persona y agregarla a la tabla
        Person person = new Person(firstName, lastName, dobField.getValue());
        table.getItems().add(person);

        // Limpiar los campos después de añadir
        fNameField.clear();
        lNameField.clear();
        dobField.setValue(null);
    }

    /**
     * Elimina las personas seleccionadas de la tabla.
     */
    private void removeSelectedPersons() {
        // Obtener elementos seleccionados y eliminarlos
        ObservableList<Person> selectedItems = table.getSelectionModel().getSelectedItems();
        table.getItems().removeAll(selectedItems);
    }
}

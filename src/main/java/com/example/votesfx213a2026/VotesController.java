package com.example.votesfx213a2026;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * This class is the controller for the Votes application. It manages the interaction between the user interface and the underlying data model.
 *
 * @author Zsolt Harmath
 * @implSpec TODO: Implement the necessary fields and methods to handle user interactions and solve the specified tasks.
 */
public class VotesController implements Initializable {
    /**
     * The TableView that displays the votes.
     */
    public TableView votesTableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // log data
        // System.out.println(VotesData.votes.length);
    }
}
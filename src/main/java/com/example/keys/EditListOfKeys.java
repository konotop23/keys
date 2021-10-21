package com.example.keys;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EditListOfKeys {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea textFieldForKeysEdit1;

    @FXML
    private Button buttonSearch;

    @FXML
    private TextField textFieldForNameEdit;

    @FXML
    private Label textLabel;

    @FXML
    private Button mainButtonEditAndSave1;

    @FXML
    private Button mainButtonEditAndSave2;

    @FXML
    private TextArea textFieldForKeysEdit2;



    @FXML
    void initialize() {

    }

    public void setButtonSearch(Button buttonSearch) {
        this.buttonSearch = buttonSearch;

        String textFieldForName = textFieldForNameEdit.getText().trim();
        String keyText = textFieldForKeysEdit1.getText().trim();
        String keyText1 = textFieldForKeysEdit2.getText().trim();

        String infoAboutKeys;
    }
}


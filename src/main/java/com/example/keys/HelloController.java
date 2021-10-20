package com.example.keys;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import connection.ConnectionManager;
import connection.Const;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button mainButtonSecond;

    @FXML
    private Button mainButtonMore;

    @FXML
    private TextField textFieldForName;

    @FXML
    private TextArea textFieldForKeys;

    @FXML
    private Button mainButtonFirst;

    @FXML
    private Label textLabel;


    @FXML
    void initialize() {
        mainButtonFirst.setOnAction(event -> setMainButtonFirst());
        mainButtonSecond.setOnAction(event -> setMainButtonSecond());
        mainButtonMore.setOnAction(event -> setMainButtonMore());
    }


    public void setMainButtonFirst(){
        String nameText = textFieldForName.getText().trim();
        String keyText = textFieldForKeys.getText().trim();

        String createPersonB22_1 = "INSERT INTO keys_people ("+ Const.NAME_PERSON +", " + Const.LIST_OF_KEYS_B22_1 + ") VALUES (?,?)";

        try {
            Connection connection = ConnectionManager.open();
            PreparedStatement preparedStatement = connection.prepareStatement(createPersonB22_1);
            preparedStatement.setString(1,nameText);
            preparedStatement.setString(2,keyText);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

            textLabel.setTextFill(Color.FORESTGREEN);
            textLabel.setText("Успешно добавлено");
        } catch (SQLException e) {
            textLabel.setTextFill(Color.RED);
            textLabel.setText("Неудачное добавление");
            e.printStackTrace();
        }
    }

    public void setMainButtonSecond(){
        String nameText = textFieldForName.getText().trim();
        String keyText = textFieldForKeys.getText().trim();

        String createPersonB22_2 = "INSERT INTO keys_people ("+ Const.NAME_PERSON +", " + Const.LIST_OF_KEYS_B22_2 + ") VALUES (?,?)";

        try {
            Connection connection = ConnectionManager.open();
            PreparedStatement preparedStatement = connection.prepareStatement(createPersonB22_2);
            preparedStatement.setString(1,nameText);
            preparedStatement.setString(2,keyText);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

            textLabel.setTextFill(Color.FORESTGREEN);
            textLabel.setText("Успешно добавлено");
        } catch (SQLException e) {
            System.out.println("Неудачное добавление"); e.printStackTrace();
        }
    }

    public void setMainButtonMore(){
        mainButtonMore.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("app.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root,800,600));
        stage.setResizable(false);
        stage.showAndWait();
    }
}
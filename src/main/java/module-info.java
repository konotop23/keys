module com.example.keys {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens com.example.keys to javafx.fxml;
    exports com.example.keys;
    exports connection;
    opens connection to javafx.fxml;
}
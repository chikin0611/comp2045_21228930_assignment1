module com.example.comp2045_21228930_assignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comp2045_21228930_assignment1 to javafx.fxml;
    exports com.example.comp2045_21228930_assignment1;
}
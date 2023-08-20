module com.example.first_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;


    opens com.example.first_project to javafx.fxml;
    exports com.example.first_project;
}
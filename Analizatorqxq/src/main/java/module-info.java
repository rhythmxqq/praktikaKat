module com.example.analizatorqxq {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.analizatorqxq to javafx.fxml;
    exports com.example.analizatorqxq;
}
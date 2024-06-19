module com.example.user_aashish {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.user_aashish to javafx.fxml;
    exports com.example.user_aashish;
}
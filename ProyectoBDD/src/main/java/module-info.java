module com.example.proyectobdd {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.proyectobdd to javafx.fxml;
    exports com.example.proyectobdd;
}
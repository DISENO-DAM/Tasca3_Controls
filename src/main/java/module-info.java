module di.esteban.tasca3_controls {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens di.esteban.tasca3_controls to javafx.fxml;
    exports di.esteban.tasca3_controls;
}
module univr.ing.carconfig {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens univr.ing.carconfig to javafx.fxml;
    exports univr.ing.carconfig;
}
module com.pyload.cafeteriauca {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.pyload.cafeteriauca to javafx.fxml;
    exports com.pyload.cafeteriauca;
}
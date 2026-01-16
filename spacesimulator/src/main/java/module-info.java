module com.dnbsammie.spacesimulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires com.google.gson;
    requires ch.qos.logback.classic;
    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires transitive javafx.graphics;

    opens com.dnbsammie.spacesimulator.ui to javafx.fxml;
    opens com.dnbsammie.spacesimulator.data to com.google.gson;

    exports com.dnbsammie.spacesimulator.app;

    opens com.dnbsammie.spacesimulator.app to javafx.fxml;
}
package com.dnbsammie.spacesimulator.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SpaceSimulatorApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/dnbsammie/spacesimulator/views/main-view.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Space Simulator");
        stage.setScene(scene);
        stage.show();
    }
}

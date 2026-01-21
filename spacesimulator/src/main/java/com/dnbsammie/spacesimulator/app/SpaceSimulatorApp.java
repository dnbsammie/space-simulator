package com.dnbsammie.spacesimulator.app;

import com.dnbsammie.spacesimulator.ui.MainController;
import com.dnbsammie.spacesimulator.ui.NavigationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class SpaceSimulatorApp extends Application {
        @Override
        public void start(Stage stage) throws Exception {
                FXMLLoader loader = new FXMLLoader(
                                getClass().getResource("/com/dnbsammie/spacesimulator/ui/views/main-view.fxml"));

                Scene scene = new Scene(loader.load());

                scene.getStylesheets().addAll(
                                Objects.requireNonNull(getClass()
                                                .getResource("/com/dnbsammie/spacesimulator/ui/styles/base.css"))
                                                .toExternalForm(),
                                Objects.requireNonNull(getClass()
                                                .getResource("/com/dnbsammie/spacesimulator/ui/styles/buttons.css"))
                                                .toExternalForm());

                stage.getIcons().add(new Image(
                                Objects.requireNonNull(getClass()
                                                .getResource("/com/dnbsammie/spacesimulator/ui/images/logo/logo.png"))
                                                .toExternalForm()));
                // Initial Scene
                stage.setTitle("Space Simulator");
                stage.setScene(scene);
                stage.setMinWidth(640);
                stage.setMinHeight(360);
                stage.setResizable(true);
                stage.centerOnScreen();
                stage.show();

                MainController mainController = loader.getController();
                NavigationController navigation = new NavigationController(mainController);
                mainController.setNavigation(navigation);
                navigation.start();
        }

        public static void main(String[] args) {launch(args); }
}

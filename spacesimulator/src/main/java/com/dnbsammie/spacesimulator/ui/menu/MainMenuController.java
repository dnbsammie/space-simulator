package com.dnbsammie.spacesimulator.ui.menu;

import com.dnbsammie.spacesimulator.ui.BaseController;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class MainMenuController extends BaseController {
    @FXML
    private BorderPane mainMenu;

    @FXML
    private void onStartTravel() {
        goToTravel();
    }

    @FXML
    private void onSettings() {
        goToSettings();
    }

    @FXML
    private void onExit() {
        exit();
    }
}

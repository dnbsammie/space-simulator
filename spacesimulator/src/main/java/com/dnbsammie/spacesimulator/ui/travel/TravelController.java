package com.dnbsammie.spacesimulator.ui.travel;

import com.dnbsammie.spacesimulator.ui.BaseController;

import javafx.fxml.FXML;

public class TravelController extends BaseController {

    @FXML
    private void onAbortMission() {
        goToMainMenu();
    }

    @FXML
    private void onOpenSettings() {
        goToSettings();
    }
}

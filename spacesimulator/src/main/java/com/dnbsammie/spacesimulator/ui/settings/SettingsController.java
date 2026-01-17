package com.dnbsammie.spacesimulator.ui.settings;

import com.dnbsammie.spacesimulator.ui.BaseController;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class SettingsController extends BaseController {
    @FXML private ScrollPane settingsScroll;

    @FXML private VBox videoSection;
    @FXML private VBox interfaceSection;
    @FXML private VBox profileSection;

    private void scrollToSection(VBox section) {
        double contentHeight = settingsScroll.getContent().getBoundsInLocal().getHeight();
        double y = section.getBoundsInParent().getMinY();
        settingsScroll.setVvalue(y / contentHeight);
    }
    // Top
    @FXML
    private void returnToMenu() {goToMainMenu();}
    // Left - Sidebar
    @FXML
    private void onVideoSettings() {
        scrollToSection(videoSection);
    }

    @FXML
    private void onInterfaceSettings() {
        scrollToSection(interfaceSection);
    }

    @FXML
    private void onProfileSettings() {
        scrollToSection(profileSection);
    }
    // Bottom
    @FXML
    private void resetSettings(){
        // Default settings
    }

    @FXML
    private void applySettings(){
        // Aplicar y guardar configuraciones.
    }

}

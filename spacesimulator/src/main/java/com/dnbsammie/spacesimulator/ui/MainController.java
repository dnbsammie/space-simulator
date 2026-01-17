package com.dnbsammie.spacesimulator.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class MainController {
    @FXML
    private BorderPane root;

    private NavigationController navigation;

    public void setNavigation(NavigationController navigation) {
        this.navigation = navigation;
    }
    // Set
    public void setTop(String fxml) {root.setTop(load(fxml));}
    public void setLeft(String fxml){root.setLeft(load(fxml));}
    public void setCenter(String fxml){root.setCenter(load(fxml));}
    public void setRight(String fxml){root.setRight(load(fxml));}
    public void setBottom(String fxml){root.setBottom(load(fxml));}
    // Clear
    public void clearAll() {
        root.setTop(null);
        root.setLeft(null);
        root.setCenter(null);
        root.setRight(null);
        root.setBottom(null);
    }

    private Node load(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Node view = loader.load();

            Object controller = loader.getController();
            if (controller instanceof BaseController baseController) {
                baseController.navigation = this.navigation;
            }

            return view;
        } catch (Exception e) {
            throw new RuntimeException("Could not load: " + fxml, e);
        }
    }
}

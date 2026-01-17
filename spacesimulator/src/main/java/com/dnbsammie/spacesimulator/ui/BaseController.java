package com.dnbsammie.spacesimulator.ui;

public class BaseController {
    protected NavigationController navigation;

    public void setNavigationController(NavigationController navigation) {
        this.navigation = navigation;
    }
    // Shortcuts
    protected void goToMainMenu(){navigation.navigateTo(ViewType.MAIN_MENU);}
    protected void goToTravel() {navigation.navigateTo(ViewType.TRAVEL);}
    protected void goToSettings() {navigation.navigateTo(ViewType.SETTINGS);}
    protected void exit() {navigation.navigateTo(ViewType.EXIT);}
}

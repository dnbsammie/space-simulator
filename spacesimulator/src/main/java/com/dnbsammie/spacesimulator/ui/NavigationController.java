package com.dnbsammie.spacesimulator.ui;

public class NavigationController {
    private final MainController main;
    private ViewType currentView;

    public NavigationController(MainController main) {
        this.main = main;
    }

    public void start(){navigateTo(ViewType.MAIN_MENU);}

    public void navigateTo(ViewType viewType) {
        if(viewType==currentView) return;

        main.clearAll();

        switch (viewType) {
            case MAIN_MENU -> main.setCenter("/com/dnbsammie/spacesimulator/ui/views/menu/main-menu.fxml");
            case TRAVEL -> {
                main.setTop("/com/dnbsammie/spacesimulator/ui/views/travel/top.fxml");
                main.setLeft("/com/dnbsammie/spacesimulator/ui/views/travel/left.fxml");
                main.setCenter("/com/dnbsammie/spacesimulator/ui/views/travel/center.fxml");
                main.setRight("/com/dnbsammie/spacesimulator/ui/views/travel/right.fxml");
                main.setBottom("/com/dnbsammie/spacesimulator/ui/views/travel/bottom.fxml");
            }
            case SETTINGS -> {
                main.setTop("/com/dnbsammie/spacesimulator/ui/views/settings/top.fxml");
                main.setLeft("/com/dnbsammie/spacesimulator/ui/views/settings/sidebar.fxml");
                main.setCenter("/com/dnbsammie/spacesimulator/ui/views/settings/center.fxml");
                main.setBottom("/com/dnbsammie/spacesimulator/ui/views/settings/bottom.fxml");
            }
            case EXTRAS -> main.setTop("/com/dnbsammie/spacesimulator/ui/views/extras/top.fxml");
            case EXIT -> {
                System.exit(0);
                return;
            }
        }
        currentView=viewType;
    }
}
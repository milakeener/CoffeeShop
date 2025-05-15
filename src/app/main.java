package app;

import services.MenuService;

public class main {
    public static void main(String[] args){

        MenuService menuService = new MenuService();
        menuService.launch();
    }
}
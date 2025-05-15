package services;

import java.util.Scanner;

public class ViewMenu {

    public void launch() {
        MenuService menuService = new MenuService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our menu!\n" +
                "\t Hot Drinks \n" +
                "\t Latte | $4.50 \n" +
                "\t Cappuccino | $4.00 \n" +
                "\t Americano | $3.50 \n" +
                "\t \n" +
                "\t Cold Drinks \n" +
                "\t Iced Latte | $4.75 \n" +
                "\t Iced Americano | $4.00 \n" +
                "\t Frappe | $5.00 \n");

        System.out.println("Please press 9 to return to home.");
        int choice = scanner.nextInt();

        if (choice == 9) {
            return;
        }
    }
}

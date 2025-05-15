package services;

import models.ColdDrink;
import models.Customer;
import models.Drink;
import models.HotDrink;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderService{
    int add = 0;
    private ArrayList<Drink> cart = new ArrayList<>();

    public void addItem(){

    }

    private void checkout(Customer customer) {
        Scanner name = new Scanner(System.in);
        double total = 0;
        for (Drink drink : cart){
            System.out.printf("%s | $%.2f%n", drink.getName(), drink.getPrice());
            total += drink.getPrice();
        }
        customer.setMoneySpent(customer.getMoneySpent() + (int) total);
        customer.setRewardPoints(customer.getRewardPoints() + (int) total);
        customer.updateMembership();
        System.out.printf("Total: $%.2f%n", total);
        System.out.println("Thank you for your order, " + customer.getCustomerName() + "!");
    }

    public void launch(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the ordering service! \n" +
                    "\t Please select the items that you would like to order.\n" +
                    "\t \n" +
                    "\t 1. Latte | $4.50 \n" +
                    "\t 2. Cappuccino | $4.00 \n" +
                    "\t 3. Americano | $3.50 \n" +
                    "\t 4. Iced Latte | $4.75 \n" +
                    "\t 5. Iced Americano | $4.00 \n" +
                    "\t 6. Frappe | $5.00 \n" +
                    "\t 7. Checkout \n" +
                    "\t Please press 9 to return to home.");

            int add = scanner.nextInt();
            switch (add) {
                case 1 -> cart.add(new HotDrink("Latte", 4.50));
                case 2 -> cart.add(new HotDrink("Cappuccino", 4.00));
                case 3 -> cart.add(new HotDrink("Americano", 3.50));
                case 4 -> cart.add(new ColdDrink("Iced Latte", 4.75));
                case 5 -> cart.add(new ColdDrink("Iced Americano", 4.00));
                case 6 -> cart.add(new ColdDrink("Frappe", 5.00));
                case 7 -> {
                    running = false;
                    checkout(customer);
                }
                case 9 -> {
                    running = false;
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
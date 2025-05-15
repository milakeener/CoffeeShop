package services;

import models.Customer;

import java.util.Scanner;

public class AccountService {
    private static int nextId = 1000;

    public static int generateId() {
        return nextId++;
    }

    private Customer currentCustomer;

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }


    public void register(){
        Scanner account = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        int id = generateId();
        System.out.println("Please enter your name.");
        String name = account.next();
        System.out.println("Please enter your cellphone number.");
        String customerNum = number.next();
        currentCustomer = new Customer(name, customerNum, id, 0, 0, "Bronze");
        System.out.println("Here is your account information!");
        System.out.println("Name: " + name);
        System.out.println("Number: " + customerNum);
        System.out.println("ID: " + id);
    }

    public void viewAccount(){
        System.out.println("Name: " + currentCustomer.getCustomerName());
        System.out.println("Number: " + currentCustomer.getCustomerNumber());
        System.out.println("ID: " + currentCustomer.getCustomerID());
        System.out.println("Membership Level: " + currentCustomer.getMembershipLevel());
        System.out.println("Spending: " + currentCustomer.getMoneySpent());
        System.out.println("Current Number of Points: " + currentCustomer.getRewardPoints());
    }

    public void launch() {
        MenuService menuService = new MenuService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Thank you for creating an account with us!");
        register();
        System.out.println("Please press 9 to return to home.");
        int choice = scanner.nextInt();

        if (choice == 9) {
            return;
        }
    }
}

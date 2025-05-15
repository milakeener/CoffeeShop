package services;

import models.Customer;

import java.util.Scanner;

public class DonationService {

    private AccountService accountService;

    public DonationService(AccountService accountService){
        this.accountService = accountService;
    }

    public void donate(Customer customer) {
        Scanner donation = new Scanner(System.in);
        System.out.println("Please enter your donation amount!");
        int amount = donation.nextInt();
        customer.setMoneySpent(customer.getMoneySpent() + amount);
        customer.setRewardPoints(customer.getRewardPoints() + amount);
        customer.updateMembership();
        customer.addDonation(amount);
        System.out.println("Thank you for your generosity!");
        System.out.println("Here are our total donations raised!");
        System.out.println(customer.getDonationsMade());
    }

    public void launch(Customer customer) {
        MenuService menuService = new MenuService();
        Scanner scanner = new Scanner(System.in);
        donate(customer);
        System.out.println("Please press 9 to return to home.");
        int choice = scanner.nextInt();

        if (choice == 9) {
            return;
        }
    }
}

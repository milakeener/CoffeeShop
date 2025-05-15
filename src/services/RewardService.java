package services;

import java.util.Scanner;
import services.AccountService;

public class RewardService{
    private AccountService accountService;

    public RewardService(AccountService accountService){
        this.accountService = accountService;
    }

    public void launch() {
        MenuService menuService = new MenuService();
        Scanner scanner = new Scanner(System.in);

        if (accountService.getCurrentCustomer() != null) {
            accountService.viewAccount();
        } else {
            System.out.println("No account found. Please register first.");
        }
        System.out.println("Please press 9 to return to home.");
        int choice = scanner.nextInt();

        if (choice == 9) {
            return;
        }
    }
}
package services;

import java.util.Scanner;

public class MenuService {

    Scanner scanner = new Scanner(System.in);
    boolean returnToMenu = true;
    private AccountService accountService = new AccountService();


    public void launch(){
        System.out.println("⋆☕\uFE0E ˖ Welcome to MilaMila Coffee! ˖ ☕\uFE0E⋆ \n" +
                "\t How can I help you? \n" +
                "\t Please select from the following options. \n");
        int choice = -1;

        while (returnToMenu){
                System.out.println("\t 1. Make a Purchase \n" +
                "\t 2. View Menu \n" +
                "\t 3. Register \n" +
                "\t 4. View Account \n" +
                "\t 5. Donate to Support our Mission \n" +
                "\t 6. Exit \n");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Please select your items!");
                        OrderService orderService = new OrderService();
                        if (accountService.getCurrentCustomer() != null) {
                            orderService.launch(accountService.getCurrentCustomer());
                        } else {
                            System.out.println("You must register an account before placing an order!");
                        }
                        break;
                    case 2:
                        System.out.println("Here is our menu.");
                        ViewMenu viewMenu = new ViewMenu();
                        viewMenu.launch();
                        break;
                    case 3:
                        System.out.println("Welcome to the account registration process!");
                        accountService.launch();
                        break;
                    case 4:
                        System.out.println("Welcome to your account details.");
                        RewardService rewardService = new RewardService(accountService);
                        rewardService.launch();
                        break;
                    case 5:
                        System.out.println("Thank you for your generosity!");
                        if (accountService.getCurrentCustomer() != null) {
                            accountService.viewAccount();
                        } else {
                            System.out.println("No account found. Please register first so your donation can be rewarded!");
                        }
                        DonationService donationService = new DonationService(accountService);
                        donationService.launch(accountService.getCurrentCustomer());
                        break;
                    case 6:
                        System.out.println("Have a great day!");
                        returnToMenu = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again!");
                }
        }

        scanner.close();
    }
}
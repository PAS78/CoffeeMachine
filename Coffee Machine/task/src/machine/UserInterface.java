package machine;

import java.util.Objects;
import java.util.Scanner;

public class UserInterface {

    public static int money = 550;
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;

    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void status() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans\n", beans);
        System.out.printf("%d disposable cups\n", cups);
        System.out.printf("$%d of money\n", money);
        System.out.println();
    }

    public void run() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String input = scanner.nextLine();
            if (Objects.equals(input, "exit")) {
                break;
            } else {
                new Request(input);
            }
        }

//        String waterInput = scanner.nextLine();
//        String milkInput = scanner.nextLine();
//        String coffeeInput = scanner.nextLine();
//        String cupsInput = scanner.nextLine();
//
//        int waterInt = Integer.parseInt(waterInput);
//        int milkInt = Integer.parseInt(milkInput);
//        int coffeInt = Integer.parseInt(coffeeInput);
//        int cupsInt = Integer.parseInt(cupsInput);
//
//        CoffeeCups cups = new CoffeeCups(waterInt, milkInt, coffeInt);
//        int maxCups = cups.getMaxCups();
//        int minCups = cups.getMinCups();
//
//        if (minCups == cupsInt) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (minCups > cupsInt) {
//            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", minCups - 1);
//        } else if (minCups < cupsInt) {
//            System.out.printf("No, I can make only %d cup(s) of coffee", minCups);
//        }

    }

    private void makeRequest(String input) {
        int cup = Integer.parseInt(input);
        System.out.printf("For %d cups of coffee you will need:\n", cup);

        int water = 200 * cup;
        int milk = 50 * cup;
        int coffee = 15 * cup;

        System.out.printf("%d ml of water\n", water);
        System.out.printf("%d ml of milk\n", milk);
        System.out.printf("%d g of coffee beans\n", coffee);

    }

}

package machine;

import java.util.Scanner;

import static machine.UserInterface.*;

public class Request {

    private String input;

    public Request(String input) {
        this.input = input;
        makeRequest();
    }

    private void makeRequest() {
        switch (input) {
            case "buy":
                selectBuy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                status();
                break;

        }
    }

    private void take() {
        System.out.printf("I gave you $%d\n\n", money);
        money = 0;
    }

    private void fill() {
        System.out.println("Write how many ml of water you want to add:");
        Scanner scanner = new Scanner(System.in);
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        cups += scanner.nextInt();

        System.out.println();
    }

    private void selectBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "back":
                break;
            case "1":
                checkAndBuy(250, 16, 0, 4);
                break;
            case "2":
                checkAndBuy(350, 20, 75, 7);
                break;
            case "3":
                checkAndBuy(200, 12, 100, 6);
                break;
        }

        System.out.println();
    }

    private void checkAndBuy(int waterNeed, int beansNeed, int milkNeed, int moneyNeed) {

        if (water < waterNeed) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < milkNeed) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < beansNeed) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= waterNeed;
            beans -= beansNeed;
            cups--;
            money += moneyNeed;
            milk -= milkNeed;
        }
    }


}

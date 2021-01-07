package machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var coffee = new CoffeeMachine();
        String option;
        do {
            System.out.println("Write an action (buy, fill, take, remaining, exit):");
            option = scanner.next();
            switch (option) {
                case "buy" -> {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String type = scanner.next();
                    coffee.buy(type);
                }
                case "fill" -> {
                    System.out.println("Write how many ml of water do you want to add:");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int coffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cups = scanner.nextInt();
                    System.out.println();
                    coffee.fill(water, milk, coffeeBeans, cups);
                }
                case "remaining" -> coffee.details();
                case "take" -> coffee.money();

            }
        } while (!("exit".equals(option)));
    }
}
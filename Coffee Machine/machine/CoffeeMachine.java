package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;
        String option = null;
        do {
            System.out.println();
            System.out.println("Write an action (buy, fill, take, remaining, exit):");
            option = scanner.next();
            switch (option) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String type = scanner.next();
                    switch (type) {
                        case "1":
                            if (water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                                water = water - 250;
                                coffeeBeans = coffeeBeans - 16;
                                cups = cups - 1;
                                money = money + 4;
                                System.out.println("I have enough resource, making you a coffee!");
                            } else {
                                espressoCheck(water, coffeeBeans, cups);
                            }
                            break;
                        case "2":
                            if (water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
                                water = water - 350;
                                milk = milk - 75;
                                coffeeBeans = coffeeBeans - 20;
                                cups = cups - 1;
                                money = money + 7;
                                System.out.println("I have enough resource, making you a coffee!");
                            } else{
                                latteCheck(water, milk, coffeeBeans, cups);
                            }
                            break;

                        case "3":
                            if (water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
                            water = water - 200;
                            milk = milk - 100;
                            coffeeBeans = coffeeBeans - 12;
                            cups = cups - 1;
                            money = money + 6;
                            } else {
                                cappuccinoCheck(water, milk, coffeeBeans, cups);
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println();
                    System.out.println("Write how many ml of water do you want to add:");
                    water = water + scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk = milk + scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    coffeeBeans = coffeeBeans + scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups = cups + scanner.nextInt();
                    System.out.println();
                    break;
                case "take":
                    System.out.println();
                    System.out.println("I gave you " + money);
                    money = 0;
                    break;
                case "remaining":
                    details(water, milk, coffeeBeans, cups, money);
            }
        } while (!("exit".equals(option))) ;

    }

    static void details(int water, int milk, int coffeeBeans, int cups, int money) {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk ");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

    }
    static void espressoCheck(int water,int coffeeBeans, int cups) {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }
    static void latteCheck(int water, int milk, int coffeeBeans, int cups){
        if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk");
        }
    }
    static void cappuccinoCheck(int water, int milk, int coffeeBeans, int cups){
        if (water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeans < 12) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk");
        }
    }
}

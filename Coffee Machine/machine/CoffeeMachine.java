package machine;

public class CoffeeMachine {

    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int cups = 9;
    int money = 550;


    public void buy(String type) {
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
                } else {
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
    }

    public void fill(int water, int milk, int coffeeBeans, int cups) {
        System.out.println();
        this.water = this.water + water;
        this.milk = this.milk + milk;
        this.coffeeBeans = this.coffeeBeans + coffeeBeans;
        this.cups = this.cups + cups;
    }

    public void money() {
        System.out.println("I gave you " + money);
        money = 0;
    }


    public void details() {
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk ");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

    }

    public void espressoCheck(int water, int coffeeBeans, int cups) {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (coffeeBeans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }

    public void latteCheck(int water, int milk, int coffeeBeans, int cups) {
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

    public void cappuccinoCheck(int water, int milk, int coffeeBeans, int cups) {
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

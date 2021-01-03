package com.venkatasai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int flag = 0;
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        game.RandomNumGen();
        System.out.println("The number is prepared:****");
        while (flag != 1) {
            System.out.println("guess the code:");
            int UserCode = scanner.nextInt();
            game.setUserCode(UserCode);
            game.numberSplit();
            flag = game.GameSteps();
        }
    }
}

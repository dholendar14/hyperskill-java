package com.venkatasai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int flag = 0;
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the secret code");
        int SecretCode = scanner.nextInt();
        game.setSecretCode(SecretCode);
        while (flag != 1) {
            System.out.println("Enter the User code");
            int UserCode = scanner.nextInt();
            game.setUserCode(UserCode);
            game.numberSplit();
            flag = game.GameSteps();
        }
    }
}

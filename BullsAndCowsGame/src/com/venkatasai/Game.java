package com.venkatasai;

public class Game {
    private int SecretCode;
    private int userCode;
    int[] SecretCodeArray = new int[4];
    int[] UserCodeArray = new int[4];

    public void setSecretCode(int SecretCode){
        this.SecretCode = SecretCode;
    }
    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }
    int Number = SecretCode;
    public void numberSplit(){
        int i = 0;
        while(SecretCode != 0) {
            SecretCodeArray[i] = SecretCode % 10;
            SecretCode = SecretCode / 10;
            i++;
        }

        int j=0;
        while(userCode != 0) {
            UserCodeArray[j] = userCode % 10;
            userCode = userCode / 10;
            j++;
        }
    }

    public int GameSteps(){
        int bull = 0;
        int cow = 0;
        int flag = 0;
        for(int j = 0; j < SecretCodeArray.length; j++){
            for(int k = 0; k < UserCodeArray.length; k++) {
                if (SecretCodeArray[j] == UserCodeArray[k] && j == k){
                    bull++;
                } else if (SecretCodeArray[j] == UserCodeArray[k] && j != k) {
                    cow++;
                }
            }
        }
        if (bull == 4){
            System.out.println("Grade:" + bull + " bulls.");
            System.out.println("Congrats! You Won");
            return flag = 1;
        } else if (bull > 0 && bull <= 3 || cow > 0 && cow <= 3){
            System.out.println("Grade: " + bull + " bulls and " + cow + " cow." );
        } else if (cow == 4){
            System.out.println("Grade: " + cow + " cows.");
        } else {
            System.out.println("Grade: None.");
        }
        return 0;
    }
}

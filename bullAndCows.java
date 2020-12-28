import java.util.Scanner;
import java.util.Random;
class bullAndCows{
    public static Scanner scanner = new Scanner(System.in);
        public static Random random = new Random();
        public static void main(String[] args) {
            int bull = 0;
            int cow = 0;
            // creating arrays
            int[] secretcodeArray = new int[4];
            int[] numberArray = new int[4];

            int secretCode = (int)(Math.random()*9000)+1000;
            System.out.println("The secret code is prepared: ****.");
            int i = 0;
            while(secretCode != 0) {
                secretcodeArray[i] = secretCode % 10;
                secretCode = secretCode / 10;
                i++;
            }
            int number = 0000;
            int n = 1;
            while (secretCode == number){
                    i = 0;
                System.out.println("Turn "+ n +". Answer:");
                    number = scanner.nextInt();
                    int numberReference = number;
                    while(number != 0) {
                        numberArray[i] = number % 10;
                        number = number / 10;
                        i++;
                    }
                    for(int j = 0; j < secretcodeArray.length; j++){
                        for(int k = 0; k < numberArray.length; k++) {
                            if (secretcodeArray[j] == numberArray[k] && j == k){
                                bull++;
                            } else if (secretcodeArray[j] == numberArray[k] && j != k) {
                                cow++;
                            }
                        }
                    }
                    if (bull == 4){
                        System.out.println("Grade:" + bull + " bulls.");
                        System.out.println("Congrats! The secret code is " + numberReference);
                        bull = 0;
                        break;
                    } else if (bull > 0 && bull <= 3 || cow > 0 && cow <= 3){
                        System.out.println("Grade: " + bull + " bulls and " + cow + " cow." );
                        bull = 0;
                        cow = 0;
                    } else if (cow == 4){
                        System.out.println("Grade: " + cow + " cows.");
                        cow = 0;
                    } else {
                        System.out.println("Grade: None.");
                    }
                    n++;
                }
    }
}

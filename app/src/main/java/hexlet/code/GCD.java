package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class GCD {
    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    public static void findGcd() {
        System.out.println("Find the greatest common divisor of given numbers.");

        int attempts = 3;
        boolean repeat = true;
        while (repeat) {
            for (var i = 0; i < attempts; i++) {
                int num1 = getRandomInt();
                int num2 = getRandomInt();
                System.out.println("Question: " + num1 + " " + num2);

                while (num2 != 0) {
                    int temp = num2;
                    num2 = num1 % num2;
                    num1 = temp;
                }
                int result = num1;

                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                if (answer == result) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.");
                    break;
                }
            }
            System.out.print("Do you want to continue playing? (yes/no): ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                repeat = false;
            }
        }

        System.out.println("Thanks for playing!");
    }

}
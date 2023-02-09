package hexlet.code;

import java.util.Scanner;
import java.lang.Math;

public class Prime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void isPrime() {
        System.out.println("May I have your name? ");
        Scanner scannerName = new Scanner(System.in);
        String userName = scannerName.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int attempts = 3;
        int correctAnswers = 0;
            for (var i = 0; i < attempts; i++) {
                int number = Engine.getRandomInt();
                System.out.println("Question: " + number);
                System.out.print("Your answer: ");

                Scanner scanner = new Scanner(System.in);
                String answer = scanner.next();

                if (isPrime(number) == true && answer.equals("yes")) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else if (isPrime(number) == false && answer.equals("no")) {
                    System.out.println("Correct!");
                    correctAnswers++;
                } else {
                    System.out.println("Incorrect!");
                    correctAnswers = 0;
                    break;
                }

                if (correctAnswers == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                    break;
                }
            }

        Engine.farewellAfterPlay();
    }
}
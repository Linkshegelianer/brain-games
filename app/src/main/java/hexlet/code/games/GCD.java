package hexlet.code;

import java.util.Scanner;

public class GCD {
    public static void findGcd() {
        System.out.println("May I have your name? ");
        Scanner scannerName = new Scanner(System.in);
        String userName = scannerName.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println("Find the greatest common divisor of given numbers.");

        int attempts = 3;
        int correctAnswers = 0;
            for (var i = 0; i < attempts; i++) {
                int num1 = Engine.getRandomInt();
                int num2 = Engine.getRandomInt();
                System.out.println("Question: " + num1 + " " + num2);
                System.out.print("Your answer: ");

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
                    correctAnswers++;
                } else {
                    System.out.println("Incorrect!");
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.");
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
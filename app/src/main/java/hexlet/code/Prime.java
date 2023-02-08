package hexlet.code;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Prime {
    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

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
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        boolean repeat = true;
        while (repeat) {
            for (var i = 0; i < attempts; i++) {
                int number = getRandomInt();
                System.out.println("Question: " + number);

                String answer = scanner.next();

                if (isPrime(number) == true && answer.equals("yes")) {
                    System.out.println("Correct!");
                } else if (isPrime(number) == false && answer.equals("no")) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
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
    }

}
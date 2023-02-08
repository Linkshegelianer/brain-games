package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Prog {
    private static int[] progression;
    private static int hiddenIndex;

    public static void generateProg(int length) {
        progression = new int[length];
        Random random = new Random();

        int first = random.nextInt(100) + 1;

        int commonDifference = random.nextInt(10);

        for (int i = 0; i < progression.length; i++) {
            progression[i] = first + i * commonDifference;
        }

        hiddenIndex = random.nextInt(progression.length);
        progression[hiddenIndex] = -1;
    }
    public static void displayProg() {
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                System.out.print(".. ");
            } else {
                System.out.print(progression[i] + " ");
            }
        }
        System.out.println();
    }

    public static int getHiddenElement() {
        return progression[hiddenIndex];
    }

    public static void findProg() {
        int attempts = 3;
        boolean repeat = true;
        while (repeat) {
            for (var i = 0; i < attempts; i++) {
                int length = 10;
                generateProg(length);
                System.out.println("What number is missing in the progression?");
                displayProg();
                System.out.println("Your answer: ");

                Scanner scanner1 = new Scanner(System.in);
                int answer = scanner1.nextInt();
                if (answer == hiddenIndex) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect!");
                    System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + hiddenIndex + "'.");
                    break;
                }
            }
            System.out.print("Do you want to continue playing? (yes/no): ");
            Scanner scanner2 = new Scanner(System.in);
            String answerString = scanner2.nextLine();
            if (!answerString.equalsIgnoreCase("yes")) {
                repeat = false;
            }
        }

        System.out.println("Thanks for playing!");
    }
}

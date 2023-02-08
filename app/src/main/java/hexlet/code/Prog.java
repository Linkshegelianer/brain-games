package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Prog {
    private static int[] progression;
    private static int hiddenIndex;

    public static void generateProgression(int length) {
        progression = new int[length];
        Random random = new Random();

        int first = random.nextInt(100) + 1;

        int commonDifference = random.nextInt(10) + 1;

        for (int i = 0; i < progression.length; i++) {
            progression[i] = first + i * commonDifference;
        }
        !!
        hiddenIndex = random.nextInt(progression.length);
        progression[hiddenIndex] = -1;
    }

    public static void findProg() {
        System.out.println("What number is missing in the progression?");

        int attempts = 3;
        boolean repeat = true;
        while (repeat) {
            for (var i = 0; i < attempts; i++) {

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
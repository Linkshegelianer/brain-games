package hexlet.code;

import java.util.Random;
public class Engine {
    public static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    public static void farewellAfterPlay() {
        System.out.println("Thanks for playing!");
    }

    public static int[] generateSequence() { // for Prog()
        int[] sequence = new int[10];
        Random random = new Random();
        int difference = random.nextInt(10) + 1;
        int firstNumber = random.nextInt(10);
        sequence[0] = firstNumber;
        for (int i = 1; i < 10; i++) {
            int nextNumber = firstNumber + (i * difference);
            sequence[i] = nextNumber;
        }
        return sequence;
    }
}

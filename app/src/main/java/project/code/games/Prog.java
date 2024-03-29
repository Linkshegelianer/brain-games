package project.code.games;

import java.util.Random;
import project.code.Engine;

public class Prog {

    private static final int MIN_NUMBERS_IN_A_ROW = 5;
    private static final int MAX_NUMBERS_IN_A_ROW = 10;
    private static final int MIN_INCREMENT = 5;
    private static final int MAX_INCREMENT = 30;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TASK = "What number is missing in the progression?";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static void start() {
        String[][] questionsAnswers = generateProg();
        Engine.startGame(TASK, questionsAnswers);
    }

    private static String[][] generateProg() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (String[] questionAnswer : questionsAnswers) {
            Random random = new Random();
            int numbersInARow = random.nextInt(MIN_NUMBERS_IN_A_ROW, MAX_NUMBERS_IN_A_ROW);
            int hiddenNumberIndex = random.nextInt(0, numbersInARow - 1);
            int increment = random.nextInt(MIN_INCREMENT, MAX_INCREMENT);
            int currentNumber = random.nextInt(0, MAX_RANDOM_NUMBER);
            String[] progression = new String[numbersInARow];
            for (int j = 0; j < numbersInARow; j++) {
                if (j != hiddenNumberIndex) {
                    progression[j] = String.valueOf(currentNumber);
                } else {
                    progression[j] = "..";
                    questionAnswer[ANSWER_ROW_NUMBER] = String.valueOf(currentNumber);
                }
                currentNumber += increment;
            }
            questionAnswer[QUESTION_ROW_NUMBER] = String.join(" ", progression);
        }
        return questionsAnswers;
    }

}

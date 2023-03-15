package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Prog {

    private static final int QUESTIONS_COUNT = 3;
    private static final int MIN_NUMBERS_IN_A_ROW = 5;
    private static final int MAX_NUMBERS_IN_A_ROW = 10;
    private static final int MIN_INCREMENT = 5;
    private static final int MAX_INCREMENT = 30;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TASK = "What number is missing in the progression?";
    private static String[][] questionsAnswers = new String[QUESTIONS_COUNT][2];
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static void start() {
        int numbersInARow = Engine.generateNumber(MIN_NUMBERS_IN_A_ROW, MAX_NUMBERS_IN_A_ROW);
        String[] progression = new String[numbersInARow];
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int hiddenNumberIndex = Engine.generateNumber(0, numbersInARow - 1);
            int increment = Engine.generateNumber(MIN_INCREMENT, MAX_INCREMENT);
            int currentNumber = Engine.generateNumber(0, MAX_RANDOM_NUMBER);
            Arrays.fill(progression, "");
            questionsAnswers[i][QUESTION_ROW_NUMBER] = "";
            for (int j = 0; j < numbersInARow; j++) {
                if (j != hiddenNumberIndex) {
                    progression[j] = String.valueOf(currentNumber);
                } else {
                    progression[j] = "..";
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(currentNumber);
                }
                currentNumber += increment;
            }
            questionsAnswers[i][QUESTION_ROW_NUMBER] = String.join(" ", progression);
        }
        Engine.startGame(TASK, questionsAnswers);
    }

}

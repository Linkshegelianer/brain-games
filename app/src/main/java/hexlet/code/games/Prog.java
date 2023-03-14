package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Prog {
    private static final int questionsCount = 3;
    private static final int maxRandomNumber = 100;
    private static final String task = "What number is missing in the progression?";
    private static String[][] questionsAnswers = new String[questionsCount][2];
    private static final int questionRowNumber = 0;
    private static final int answerRowNumber = 1;

    public static void start() {
        int numbersInARow = getRandomNumber(5, 10); // the length of the sequence can be from 5 to 10
        String[] progression = new String[numbersInARow];
        for (int i = 0; i < questionsCount; i++) {
            int hiddenNumberIndex = getRandomNumber(0, numbersInARow - 1);
            int increment = getRandomNumber(1, 10); // the increment of the sequential digit can be from 1 to 10
            int currentNumber = getRandomNumber(0, maxRandomNumber);
            Arrays.fill(progression, "");
            questionsAnswers[i][questionRowNumber] = "";
            for (int j = 0; j < numbersInARow; j++) {
                if (j != hiddenNumberIndex) {
                    progression[j] = String.valueOf(currentNumber);
                } else {
                    progression[j] = "..";
                    questionsAnswers[i][answerRowNumber] = String.valueOf(currentNumber);
                }
                currentNumber += increment;
            }
            questionsAnswers[i][questionRowNumber] = String.join(" ", progression);
        }
        Engine.startGame(task, questionsAnswers);
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}


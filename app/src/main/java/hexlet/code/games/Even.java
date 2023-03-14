package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int questionsCount = 3;
    private static final int maxRandomNumber = 100;
    private static final String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[][] questionsAnswers = new String[questionsCount][2];
    private static final int questionRowNumber = 0;
    private static final int answerRowNumber = 1;
    public static void start() {
        for (int i = 0; i < questionsCount; i++) {
            int questionNumber = (int) (Math.random() * maxRandomNumber);
            questionsAnswers[i][questionRowNumber] = String.valueOf(questionNumber);
            questionsAnswers[i][answerRowNumber] = (isEven(questionNumber)) ? "yes" : "no";
        }
        Engine.startGame(task, questionsAnswers);
    }

    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }

}

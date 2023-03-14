package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int questionsCount = 3;
    private static final int maxRandomNumber = 100;
    private static final String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[][] questionsAnswers = new String[questionsCount][2];
    private static final int questionRowNumber = 0;
    private static final int answerRowNumber = 1;
    public static void start() {
        for (int i = 0; i < questionsCount; i++) {
            int questionNumber = (int) (Math.random() * maxRandomNumber);
            questionsAnswers[i][questionRowNumber] = String.valueOf(questionNumber);
            questionsAnswers[i][answerRowNumber] = (isPrime(questionNumber)) ? "yes" : "no";
        }
        Engine.startGame(task, questionsAnswers);
    }

    private static boolean isPrime(int currentNumber) {
        if (currentNumber < 2) {
            return false;
        }
        for (int i = 2; i <= currentNumber / 2; i++) {
            if (currentNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}

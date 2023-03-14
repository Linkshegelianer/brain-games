package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    private static final int questionsCount = 3;
    private static final int maxRandomNumber = 100;
    private static final String task = "Find the greatest common divisor of given numbers.";
    private static String[][] questionsAnswers = new String[questionsCount][2];
    private static final int questionRowNumber = 0;
    private static final int answerRowNumber = 1;
    public static void start() {
        for (int i = 0; i < questionsCount; i++) {
            int questionNumber1 = (int) (Math.random() * maxRandomNumber);
            int questionNumber2 = (int) (Math.random() * maxRandomNumber);
            questionsAnswers[i][questionRowNumber] = questionNumber1 + " " + questionNumber2;
            questionsAnswers[i][answerRowNumber] = String.valueOf(gcd(questionNumber1, questionNumber2));
        }
        Engine.startGame(task, questionsAnswers);
    }

    private static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

}

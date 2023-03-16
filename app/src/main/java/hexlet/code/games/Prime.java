package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    public static void start() {
        String[][] questionsAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (String[] questionAnswer : questionsAnswers) {
            int questionNumber = Engine.generateNumber(1, MAX_RANDOM_NUMBER);
            questionAnswer[QUESTION_ROW_NUMBER] = String.valueOf(questionNumber);
            questionAnswer[ANSWER_ROW_NUMBER] = (isPrime(questionNumber)) ? "yes" : "no";
        }
        Engine.startGame(TASK, questionsAnswers);
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

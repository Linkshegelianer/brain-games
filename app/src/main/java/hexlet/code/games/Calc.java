package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int questionsCount = 3; // only three unique questions for a session

    private static final String task = "What is the result of the expression?";
    private static String[][] questionsAnswers = new String[questionsCount][2];
    private static final int questionRowNumber = 0;
    private static final int answerRowNumber = 1;
    private static final char[] mathOperators = {'+', '-', '*'};
    private static final int maxRandomNumber = 100;
    public static void start() {
        for (int i = 0; i < questionsCount; i++) {
            int firstNum = (int) (Math.random() * maxRandomNumber + 1);
            int secondNum = (int) (Math.random() * maxRandomNumber + 1);
            int randomIndexOperator = (int) (Math.random() * mathOperators.length);
            char operator = mathOperators[randomIndexOperator];
            switch (operator) {
                case '+':
                    questionsAnswers[i][answerRowNumber] = String.valueOf(firstNum + secondNum);
                    break;
                case '-':
                    questionsAnswers[i][answerRowNumber] = String.valueOf(firstNum - secondNum);
                    break;
                default:
                    questionsAnswers[i][answerRowNumber] = String.valueOf(firstNum * secondNum);
                    break;
            }
            questionsAnswers[i][questionRowNumber] = firstNum + " " + operator + " " + secondNum;
        }
        Engine.startGame(task, questionsAnswers);
    }
}

package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final int QUESTIONS_COUNT = 3; // only three unique questions in one session
    private static final int QUESTION_ROW_NUMBER = 0; // fixed place in the matrix for a question
    private static final int ANSWER_ROW_NUMBER = 1; // fixed place in the matrix to store answer as String
    private static final String TASK = "What is the result of the expression?";
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final char[] MATH_OPERATORS = {'+', '-', '*'};
    public static void start() {
        String[][] questionsAnswers = new String[QUESTIONS_COUNT][2]; // matrix to store answers & questions

        for (int i = 0; i < QUESTIONS_COUNT; i++) { // generate questions only three times
            int firstNum = Engine.generateNumber(1, MAX_RANDOM_NUMBER);
            int secondNum = Engine.generateNumber(1, MAX_RANDOM_NUMBER);
            int randomIndexOperator = (int) (Math.random() * MATH_OPERATORS.length);
            char operator = MATH_OPERATORS[randomIndexOperator];
            switch (operator) {
                case '+':
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum + secondNum);
                    break;
                case '-':
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum - secondNum);
                    break;
                case '*':
                    questionsAnswers[i][ANSWER_ROW_NUMBER] = String.valueOf(firstNum * secondNum);
                    break;
                default:
                    throw new RuntimeException("Unknown input: " + operator);
            }
            questionsAnswers[i][QUESTION_ROW_NUMBER] = firstNum + " " + operator + " " + secondNum;
        }
        Engine.startGame(TASK, questionsAnswers); // to avoid repetition, the matrix is given to Engine class
    }

}

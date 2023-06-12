package project.code;

import java.util.Scanner;

public class Engine {

    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;

    public static final int ROUNDS_COUNT = 3; // only three unique questions in one session
    public static void startGame(String task, String[][] questionsAnswers) { // task and matrix are given from games
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        Scanner console = new Scanner(System.in);
        String username = console.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(task);

        for (String[] questionAnswer : questionsAnswers) {
            String correctAnswer = questionAnswer[ANSWER_ROW_NUMBER]; // pull the correct answer from the matrix
            System.out.println("Question: " + questionAnswer[QUESTION_ROW_NUMBER]); // print the question
            System.out.print("Your answer: ");
            var currentAnswer = console.nextLine();
            boolean isAnswerCorrect = currentAnswer.equals(correctAnswer);
            if (isAnswerCorrect) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + currentAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + username + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + username + "!");
    }

}

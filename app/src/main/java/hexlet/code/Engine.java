/*
Every game uses the same logic:
Use matrix String[][] questionsAnswers to store:
- iterable for three unique questions for one session in a first row
- in the first index of the second row store the randomly generated question
- in the second index of the second row store the answer to this question

In order to avoid repetition, the verification algorithm is written in the Engine class, which receives
the matrix containing questions and answers and a task from every game. 
 */


package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int QUESTION_ROW_NUMBER = 0;
    private static final int ANSWER_ROW_NUMBER = 1;
    public static void startGame(String task, String[][] questionsAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        Scanner console = new Scanner(System.in);
        String username = console.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(task);

        for (int i = 0; i < questionsAnswers.length; i++) {
            String correctAnswer = questionsAnswers[i][ANSWER_ROW_NUMBER]; // pull out the correct answer from the matrix
            System.out.println("Question: " + questionsAnswers[i][QUESTION_ROW_NUMBER]); // print the question
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

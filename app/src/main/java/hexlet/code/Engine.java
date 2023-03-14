package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int questionRowNumber = 0;
    private static final int answerRowNumber = 1;

    public static void startGame(String task, String[][] questionsAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        Scanner console = new Scanner(System.in);
        String username = console.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println(task);

        for (int i = 0; i < questionsAnswers.length; i++) {
            String correctAnswer = questionsAnswers[i][answerRowNumber];
            System.out.println("Question: " + questionsAnswers[i][questionRowNumber]);
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

package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
	public static int getRandomInt() {
		Random random = new Random();
		return random.nextInt(100) + 1;
	}
	public static void even() {
		System.out.println("May I have your name? ");
		Scanner scannerName = new Scanner(System.in);
		String userName = scannerName.next();
		System.out.println("Hello, " + userName + "!");

		System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

		int attempts = 3;
		boolean repeat = true;
		int correctAnswers = 0;
		while (repeat) {
			for (var i = 0; i < attempts; i++) {
				int number = getRandomInt();
				System.out.println("Question: " + number);
				System.out.print("Your answer: ");

				Scanner scannerAnswer = new Scanner(System.in);
				String answer = scannerAnswer.next();

				if (number % 2 == 0 && answer.equals("yes")) {
					System.out.println("Correct!");
					correctAnswers++;
				} else if (number % 2 != 0 && answer.equals("no")) {
					System.out.println("Correct!");
					correctAnswers++;
				} else {
					System.out.println("Incorrect!");
					correctAnswers = 0;
					break;
				}

				if (correctAnswers == 3) {
					System.out.println("Congratulations, " + userName + "!");
					break;
				}
			}
			System.out.print("Do you want to continue playing? (yes/no): ");
			Scanner answerFinal = new Scanner(System.in);
			String answer = answerFinal.nextLine();
			if (!answer.equalsIgnoreCase("yes")) {
				repeat = false;
			}
		}

		System.out.println("Thanks for playing!");
	}
}

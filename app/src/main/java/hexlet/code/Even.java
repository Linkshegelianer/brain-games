package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
	public static int getRandomInt() {
		Random random = new Random();
		return random.nextInt(100) + 1;
	}
	public static void even() {
		System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
		//int number = getRandomInt();
		// String question = "Question: " + number;

		Scanner scanner = new Scanner(System.in);

		int attempts = 3;
		for (var i = 0; i < attempts; i++) {
			int number = getRandomInt();
			System.out.println("Question: " + number);
			String answer = scanner.next();

			if (answer.equals("yes") && number % 2 == 0) {
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect!");
			}
		}

		System.out.println("Thanks for playing!");
	}
}


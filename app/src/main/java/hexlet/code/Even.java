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
		Scanner scanner = new Scanner(System.in);

		int attempts = 3;
		boolean repeat = true;
		while (repeat) {
			for (var i = 0; i < attempts; i++) {
				int number = getRandomInt();
				System.out.println("Question: " + number);
				String answer = scanner.next();

				if (number % 2 == 0 && answer.equals("yes")) {
					System.out.println("Correct!");
				} else if (number % 2 != 0 && answer.equals("no")) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
					break;
				}
			}
			System.out.print("Do you want to continue playing? (yes/no): ");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			if (!answer.equalsIgnoreCase("yes")) {
				repeat = false;
			}
		}

		System.out.println("Thanks for playing!");
	}
}

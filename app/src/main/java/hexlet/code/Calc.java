package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Calc {
	public static int getRandomInt() {
		Random random = new Random();
		return random.nextInt(100) + 1;
	}
	public static void calculator() {
		// System.out.println("What is the result of the expression?");
		System.out.println("Working on this feature!");
		/*
		Scanner scanner = new Scanner(System.in);

		int attempts = 3;
		while (repeat) {
			for (var i = 0; i < attempts; i++) {
				int number1 = getRandomInt();
				int number2 = getRandomInt();

				System.out.println("Question: " + expression);
			}
		}
		for (var i = 0; i < attempts; i++) {
			int number = getRandomInt();
			System.out.println("Question: " + number);
			String answer = scanner.next();

			if (answer.equals("yes") && number % 2 == 0) {
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect!");
			}
			*/
		}
	}
package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Calc {
	public static int getRandomInt() {
		Random random = new Random();
		return random.nextInt(100) + 1;
	}
	public static void calculator() {
		System.out.println("What is the result of the expression?");

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] operators = {"+", "-", "*"};

		int attempts = 3;
		boolean repeat = true;
		while (repeat) {
			for (var i = 0; i < attempts; i++) {
				int num1 = getRandomInt();
				int num2 = getRandomInt();
				int operator = random.nextInt(3);
				int result = 0;

				String operatorSymbol = operators[operator];
				System.out.println(num1 + " " + operatorSymbol + " " + num2 + " = ?");

				switch (operatorSymbol) {
					case "+":
						result = num1 + num2;
						break;
					case "-":
						result = num1 - num2;
						break;
					case "*":
						result = num1 * num2;
						break;
				}

				Scanner scanner1 = new Scanner(System.in);
				int answerInt = scanner1.nextInt();
				if (answerInt == result) {
					System.out.println("Correct!");
				} else {
					System.out.println("Incorrect!");
					System.out.println("'" + answerInt + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.");
					break;
				}
			}
				System.out.print("Do you want to continue playing? (yes/no): ");
				Scanner scanner2 = new Scanner(System.in);
				String answerString = scanner2.nextLine();
				if (!answerString.equalsIgnoreCase("yes")) {
					repeat = false;
				}
		}

		System.out.println("Thanks for playing!");
	}
}
package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Calc {
	public static void calculator() {
		System.out.println("May I have your name? ");
		Scanner scannerName = new Scanner(System.in);
		String userName = scannerName.next();
		System.out.println("Hello, " + userName + "!");

		System.out.println("What is the result of the expression?");

		Random random = new Random();
		String[] operators = {"+", "-", "*"};

		int attempts = 3;
		int correctAnswers = 0;
		for (var i = 0; i < attempts; i++) {
			int num1 = Engine.getRandomInt();
			int num2 = Engine.getRandomInt();
			int operator = random.nextInt(3);
			int result = 0;

			String operatorSymbol = operators[operator];
			System.out.println("Question: " + num1 + " " + operatorSymbol + " " + num2 + " = ?");
			System.out.print("Your answer: ");

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

			Scanner scannerAnswer = new Scanner(System.in);
			int answerInt = scannerAnswer.nextInt();
			if (answerInt == result) {
				System.out.println("Correct!");
				correctAnswers++;
			} else {
				System.out.println("Incorrect!");
				System.out.println("'" + answerInt + "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'.");
				System.out.println("Let's try again, " + userName + "!");
				correctAnswers = 0;
				break;
			}

			if (correctAnswers == 3) {
				System.out.println("Congratulations, " + userName + "!");
				break;
			}
		}

		Engine.farewellAfterPlay();
	}
}

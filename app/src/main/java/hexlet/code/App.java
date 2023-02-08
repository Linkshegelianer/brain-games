package hexlet.code;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the game number and press Enter.");
		System.out.println("1 - Greet");
		System.out.println("2 - Even");
		System.out.println("3 - Calculator");
		System.out.println("4 - GCD");
		System.out.println("5 - Progression");
		System.out.println("6 - Prime");
		System.out.println("0 - Exit");
		String number = scanner.next();
		System.out.println("Your choice: " + number);

		switch (number) {
			case "1":
				Cli.greetUser();
				break;
			case "2":
				Even.even();
				break;
			case "3":
				Calc.calculator();
				break;
			case "4":
				GCD.findGcd();
				break;
			case "5":
				Prog.findProg();
				break;
			case "6":
				Prime.isPrime();
				break;
			case "0":
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Incorrect number!");
				break;
		}
	}
}

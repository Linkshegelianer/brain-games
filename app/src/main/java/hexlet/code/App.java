package hexlet.code;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the game number and press Enter.");
		System.out.println("1 - Greet");
		System.out.println("2 - Even");
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
			case "0":
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Incorrect number!");
				break;
		}
	}
}


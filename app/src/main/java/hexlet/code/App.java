package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prog;
import hexlet.code.games.Prime;

public class App {
    private static final String GREET = "1";
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";
    private static final String EXIT = "0";
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc ");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner console = new Scanner(System.in);
        String response = console.nextLine();
        switch (response) {
            case GREET:
                Cli.greeting();
                break;
            case EVEN:
                Even.start();
                break;
            case CALC:
                Calc.start();
                break;
            case GCD:
                Gcd.start();
                break;
            case PROGRESSION:
                Prog.start();
                break;
            case PRIME:
                Prime.start();
                break;
            case EXIT:
                System.out.println("Bye!");
                break;
            default:
                System.out.println("Incorrect command!");
                break;
        }

    }
}

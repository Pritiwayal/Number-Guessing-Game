import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxNumber = 100; // Change this for a different range
        int maxTries = 5; // Change this for a different number of attempts

        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(maxNumber) + 1; // Generate random number between 1 and maxNumber
            int tries = 0;

            System.out.println("Welcome to the Number Guessing Game!");

            while (tries < maxTries) {
                System.out.printf("Guess a number between 1 and %d: ", maxNumber);
                int guess = scanner.nextInt();
                tries++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number in " + tries + " tries!");
                    break;
                } else if (guess > randomNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }
            }

            if (tries == maxTries) {
                System.out.println("Sorry, you ran out of tries. The number was: " + randomNumber);
            }

            System.out.println("Do you want to play again? (yes/no)");
            String answer = scanner.next();
            playAgain = answer.equalsIgnoreCase("yes");
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}

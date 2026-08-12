import java.util.Random;
import java.util.Scanner;

class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNum = random.nextInt(100) + 1;
        int userGuess;
        int counter = 0;


        do {
            System.out.println("What is your guess");
            while(!scanner.hasNextInt()) {
                System.out.println("Please Input a Valid Number:");
                scanner.next();
            }
            userGuess = scanner.nextInt();
            while (userGuess < 1 || userGuess > 100) {
                System.out.println("Choose a number between 1 - 100");
                userGuess = scanner.nextInt();
            }
            counter++;
            if(counter == 7) {
                break;
            }

            if (userGuess < targetNum) {
                System.out.println("Your guess is too low.");
            } else if (userGuess > targetNum) {
                System.out.println("Your guess is too high.");
            }

        } while (userGuess != targetNum);

        if (userGuess == targetNum) {
            System.out.println("Congrats you guessed the number!");
            System.out.println(counter + " attempts needed.");
        } else {
            System.out.println("Maximum attempts reached. Game Over!");
        }


    }
}
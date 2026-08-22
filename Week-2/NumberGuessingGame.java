import java.util.Scanner;

// Name: Kunjan

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int secretNumber = 7;
        int guess = 0;

        System.out.println("Guess the secret number!");

        while (guess != secretNumber)
        {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess < secretNumber)
            {
                System.out.println("Too low!");
            }
            else if (guess > secretNumber)
            {
                System.out.println("Too high!");
            }
            else
            {
                System.out.println("Correct! You guessed the number.");
            }
        }

        input.close();
    }
}
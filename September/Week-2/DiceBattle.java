// Name: Kunjan

import java.util.Random;
import java.util.Scanner;

public class DiceBattle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        System.out.println("==============================");
        System.out.println("         DICE BATTLE");
        System.out.println("==============================");

        System.out.print("How many rounds? ");
        int rounds = scanner.nextInt();

        for (int round = 1; round <= rounds; round++)
        {
            int playerDice = random.nextInt(6) + 1;
            int computerDice = random.nextInt(6) + 1;

            System.out.println();
            System.out.println("Round " + round);
            System.out.println("------------------------------");

            System.out.println("You rolled: " + playerDice);
            System.out.println("Computer rolled: " + computerDice);

            if (playerDice > computerDice)
            {
                System.out.println("You win this round!");
                playerScore++;
            }
            else if (computerDice > playerDice)
            {
                System.out.println("Computer wins this round!");
                computerScore++;
            }
            else
            {
                System.out.println("Draw!");
            }
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("          FINAL SCORE");
        System.out.println("==============================");

        System.out.println("You: " + playerScore);
        System.out.println("Computer: " + computerScore);

        if (playerScore > computerScore)
        {
            System.out.println("🏆 YOU WIN THE BATTLE!");
        }
        else if (computerScore > playerScore)
        {
            System.out.println("Computer wins the battle!");
        }
        else
        {
            System.out.println("The battle ends in a draw!");
        }

        scanner.close();
    }
}
// Name: Kunjan

import java.util.Scanner;

public class MiniQuizGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] questions =
        {
            "Which language are you learning?",
            "Which keyword creates an object in Java?",
            "Which collection stores key-value pairs?"
        };

        String[][] options =
        {
            {"1. Java", "2. Python", "3. C++", "4. HTML"},
            {"1. make", "2. new", "3. create", "4. object"},
            {"1. ArrayList", "2. HashMap", "3. Array", "4. String"}
        };

        int[] answers = {1, 2, 2};
        int score = 0;

        System.out.println("==============================");
        System.out.println("       JAVA MINI QUIZ");
        System.out.println("==============================");

        for (int i = 0; i < questions.length; i++)
        {
            System.out.println();
            System.out.println("Question " + (i + 1));
            System.out.println(questions[i]);

            for (String option : options[i])
            {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            int choice = scanner.nextInt();

            if (choice == answers[i])
            {
                System.out.println("Correct!");
                score++;
            }
            else
            {
                System.out.println("Wrong!");
            }
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("Quiz Complete!");
        System.out.println("Score: " + score + "/" + questions.length);

        if (score == questions.length)
        {
            System.out.println("Perfect score!");
        }
        else if (score >= 2)
        {
            System.out.println("Good job!");
        }
        else
        {
            System.out.println("Keep practising!");
        }

        scanner.close();
    }
}
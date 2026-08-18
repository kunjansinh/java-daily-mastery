import java.util.Scanner;

// Name: Kunjan

public class SumNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum from 1 to " + number + " = " + sum);

        input.close();
    }
}
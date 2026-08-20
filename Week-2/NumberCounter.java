import java.util.Scanner;

// Name: Kunjan

public class NumberCounter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int limit = input.nextInt();

        int number = 1;

        while (number <= limit)
        {
            System.out.println(number);
            number++;
        }

        input.close();
    }
}
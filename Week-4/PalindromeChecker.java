import java.util.Scanner;

// Name: Kunjan

public class PalindromeChecker
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--)
        {
            reversed = reversed + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reversed))
        {
            System.out.println("The word is a palindrome.");
        }
        else
        {
            System.out.println("The word is not a palindrome.");
        }

        input.close();
    }
}
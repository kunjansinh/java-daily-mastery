import java.util.Scanner;

// Name: Kunjan

public class ReverseString
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

        System.out.println("Reversed word: " + reversed);

        input.close();
    }
}

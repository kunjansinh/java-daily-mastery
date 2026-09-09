import java.util.Scanner;

// Name: Kunjan

public class CountVowels
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine();

        int vowelCount = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char character = Character.toLowerCase(text.charAt(i));

            if (character == 'a' ||
                character == 'e' ||
                character == 'i' ||
                character == 'o' ||
                character == 'u')
            {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        input.close();
    }
}

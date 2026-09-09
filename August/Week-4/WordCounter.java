import java.util.Scanner;

// Name: Kunjan

public class WordCounter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        if (sentence.isEmpty())
        {
            System.out.println("Number of words: 0");
        }
        else
        {
            String[] words = sentence.split("\\s+");

            System.out.println("Number of words: " + words.length);
        }

        input.close();
    }
}

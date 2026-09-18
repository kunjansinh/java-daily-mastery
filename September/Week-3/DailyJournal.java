// Name: Kunjan

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DailyJournal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("        DAILY JOURNAL");
        System.out.println("==============================");

        System.out.print("How was your day? ");
        String entry = scanner.nextLine();

        try
        {
            FileWriter writer = new FileWriter("journal.txt", true);

            writer.write(entry);
            writer.write(System.lineSeparator());

            writer.close();

            System.out.println();
            System.out.println("Journal entry saved!");
            System.out.println("File: journal.txt");
        }
        catch (IOException e)
        {
            System.out.println("Could not save journal entry.");
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
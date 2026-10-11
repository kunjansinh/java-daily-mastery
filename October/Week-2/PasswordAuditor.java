// Name: Kunjan

import java.util.Scanner;

public class PasswordAuditor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       PASSWORD AUDITOR");
        System.out.println("================================");

        System.out.print("Enter a password to evaluate: ");
        String password = scanner.nextLine();

        int score = 0;

        if (password.length() >= 12)
        {
            score++;
        }

        if (password.matches(".*[A-Z].*"))
        {
            score++;
        }

        if (password.matches(".*[a-z].*"))
        {
            score++;
        }

        if (password.matches(".*[0-9].*"))
        {
            score++;
        }

        if (password.matches(".*[^a-zA-Z0-9].*"))
        {
            score++;
        }

        System.out.println();
        System.out.println("========== RESULTS ==========");

        System.out.println("Length: " + password.length());
        System.out.println("Score: " + score + "/5");

        if (score <= 2)
        {
            System.out.println("Assessment: Weak");
        }
        else if (score <= 4)
        {
            System.out.println("Assessment: Moderate");
        }
        else
        {
            System.out.println("Assessment: Strong");
        }

        System.out.println();
        System.out.println("========== SUGGESTIONS ==========");

        if (password.length() < 12)
        {
            System.out.println("- Use at least 12 characters.");
        }

        if (!password.matches(".*[A-Z].*"))
        {
            System.out.println("- Consider adding an uppercase letter.");
        }

        if (!password.matches(".*[a-z].*"))
        {
            System.out.println("- Consider adding a lowercase letter.");
        }

        if (!password.matches(".*[0-9].*"))
        {
            System.out.println("- Consider adding a number.");
        }

        if (!password.matches(".*[^a-zA-Z0-9].*"))
        {
            System.out.println("- Consider adding a special character.");
        }

        if (score == 5)
        {
            System.out.println("All basic checks passed!");
        }

        System.out.println();
        System.out.println("Note: This is a basic heuristic, not");
        System.out.println("a complete password-security assessment.");

        scanner.close();
    }
}
// Name: Kunjan

import java.util.Scanner;

public class SecureATM
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double balance = 500.00;

        System.out.println("==============================");
        System.out.println("         SECURE ATM");
        System.out.println("==============================");

        try
        {
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");

            System.out.print("Choose: ");
            int choice = scanner.nextInt();

            if (choice == 1)
            {
                System.out.printf("Balance: £%.2f%n", balance);
            }
            else if (choice == 2)
            {
                System.out.print("Enter withdrawal amount: £");
                double amount = scanner.nextDouble();

                if (amount <= 0)
                {
                    throw new IllegalArgumentException(
                        "Amount must be greater than zero."
                    );
                }

                if (amount > balance)
                {
                    throw new IllegalArgumentException(
                        "Insufficient balance."
                    );
                }

                balance -= amount;

                System.out.printf(
                    "Withdrawal successful. New balance: £%.2f%n",
                    balance
                );
            }
            else if (choice == 3)
            {
                System.out.print("Enter deposit amount: £");
                double amount = scanner.nextDouble();

                if (amount <= 0)
                {
                    throw new IllegalArgumentException(
                        "Amount must be greater than zero."
                    );
                }

                balance += amount;

                System.out.printf(
                    "Deposit successful. New balance: £%.2f%n",
                    balance
                );
            }
            else
            {
                System.out.println("Invalid menu choice.");
            }
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Invalid input. Please enter numbers only.");
        }
        finally
        {
            System.out.println("ATM session ended.");
            scanner.close();
        }
    }
}
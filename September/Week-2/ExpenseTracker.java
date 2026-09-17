// Name: Kunjan

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExpenseTracker
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> expenses = new HashMap<>();

        System.out.println("==============================");
        System.out.println("       EXPENSE TRACKER");
        System.out.println("==============================");

        boolean running = true;

        while (running)
        {
            System.out.println();
            System.out.println("1. Add expense");
            System.out.println("2. View expenses");
            System.out.println("3. Calculate total");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
                case 1:
                    System.out.print("Expense name: ");
                    String name = scanner.nextLine();

                    System.out.print("Amount: £");
                    double amount = scanner.nextDouble();

                    expenses.put(name, amount);

                    System.out.println("Expense added.");
                    break;

                case 2:
                    System.out.println();
                    System.out.println("===== EXPENSES =====");

                    if (expenses.isEmpty())
                    {
                        System.out.println("No expenses recorded.");
                    }
                    else
                    {
                        for (Map.Entry<String, Double> expense : expenses.entrySet())
                        {
                            System.out.printf(
                                "%s: £%.2f%n",
                                expense.getKey(),
                                expense.getValue()
                            );
                        }
                    }
                    break;

                case 3:
                    double total = 0;

                    for (double amountValue : expenses.values())
                    {
                        total += amountValue;
                    }

                    System.out.printf("Total spent: £%.2f%n", total);
                    break;

                case 4:
                    running = false;
                    System.out.println("Expense Tracker closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
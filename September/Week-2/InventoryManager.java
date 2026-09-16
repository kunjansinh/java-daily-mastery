// Name: Kunjan

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> inventory = new ArrayList<>();

        System.out.println("==============================");
        System.out.println("      INVENTORY MANAGER");
        System.out.println("==============================");

        boolean running = true;

        while (running)
        {
            System.out.println();
            System.out.println("1. Add item");
            System.out.println("2. View inventory");
            System.out.println("3. Remove item");
            System.out.println("4. Search item");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1)
            {
                System.out.print("Enter item: ");
                String item = scanner.nextLine();

                inventory.add(item);

                System.out.println(item + " added to inventory.");
            }
            else if (choice == 2)
            {
                System.out.println();
                System.out.println("===== INVENTORY =====");

                if (inventory.isEmpty())
                {
                    System.out.println("Your inventory is empty.");
                }
                else
                {
                    for (int i = 0; i < inventory.size(); i++)
                    {
                        System.out.println((i + 1) + ". " + inventory.get(i));
                    }
                }
            }
            else if (choice == 3)
            {
                System.out.print("Enter item to remove: ");
                String item = scanner.nextLine();

                if (inventory.remove(item))
                {
                    System.out.println(item + " removed.");
                }
                else
                {
                    System.out.println(item + " was not found.");
                }
            }
            else if (choice == 4)
            {
                System.out.print("Enter item to search: ");
                String item = scanner.nextLine();

                if (inventory.contains(item))
                {
                    System.out.println(item + " is in your inventory.");
                }
                else
                {
                    System.out.println(item + " is not in your inventory.");
                }
            }
            else if (choice == 5)
            {
                running = false;
                System.out.println("Inventory Manager closed.");
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
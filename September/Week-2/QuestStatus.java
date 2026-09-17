// Name: Kunjan

import java.util.Scanner;

enum QuestState
{
    LOCKED,
    AVAILABLE,
    ACTIVE,
    COMPLETED,
    FAILED
}

public class QuestStatus
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        QuestState status = QuestState.LOCKED;

        System.out.println("==============================");
        System.out.println("        QUEST STATUS");
        System.out.println("==============================");

        System.out.println("Current status: " + status);

        System.out.println();
        System.out.println("1. Unlock quest");
        System.out.println("2. Start quest");
        System.out.println("3. Complete quest");
        System.out.println("4. Fail quest");

        System.out.print("Choose an action: ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                status = QuestState.AVAILABLE;
                break;

            case 2:
                status = QuestState.ACTIVE;
                break;

            case 3:
                status = QuestState.COMPLETED;
                break;

            case 4:
                status = QuestState.FAILED;
                break;

            default:
                System.out.println("Invalid action.");
        }

        System.out.println();
        System.out.println("Quest status is now: " + status);

        if (status == QuestState.COMPLETED)
        {
            System.out.println("Quest reward unlocked!");
        }
        else if (status == QuestState.FAILED)
        {
            System.out.println("Quest failed. Try again.");
        }
        else if (status == QuestState.ACTIVE)
        {
            System.out.println("Quest is currently in progress.");
        }
        else if (status == QuestState.AVAILABLE)
        {
            System.out.println("Quest is ready to start.");
        }
        else
        {
            System.out.println("Quest is locked.");
        }

        scanner.close();
    }
}
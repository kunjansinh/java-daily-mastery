// Name: Kunjan

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskRunner
{
    public static void main(String[] args)
    {
        ExecutorService executor =
            Executors.newFixedThreadPool(3);

        System.out.println("==============================");
        System.out.println("        TASK RUNNER");
        System.out.println("==============================");

        for (int i = 1; i <= 6; i++)
        {
            int taskNumber = i;

            executor.submit(() ->
            {
                String threadName =
                    Thread.currentThread().getName();

                System.out.println(
                    "Task " + taskNumber
                    + " started on " + threadName
                );

                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    Thread.currentThread().interrupt();
                }

                System.out.println(
                    "Task " + taskNumber
                    + " completed on " + threadName
                );
            });
        }

        executor.shutdown();

        try
        {
            if (executor.awaitTermination(10, TimeUnit.SECONDS))
            {
                System.out.println();
                System.out.println("All tasks completed!");
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
            System.out.println("Task runner interrupted.");
        }
    }
}
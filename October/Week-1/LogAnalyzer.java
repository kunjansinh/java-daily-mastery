// Name: Kunjan

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LogAnalyzer
{
    public static void main(String[] args)
    {
        Path logFile = Path.of("application.log");

        try
        {
            List<String> logs = Files.readAllLines(logFile);

            long errorCount = logs.stream()
                .filter(line -> line.contains("ERROR"))
                .count();

            long warningCount = logs.stream()
                .filter(line -> line.contains("WARNING"))
                .count();

            long loginFailures = logs.stream()
                .filter(line -> line.contains("LOGIN_FAILED"))
                .count();

            System.out.println("==============================");
            System.out.println("        LOG ANALYZER");
            System.out.println("==============================");

            System.out.println(
                "Total log entries: " + logs.size()
            );

            System.out.println(
                "Errors: " + errorCount
            );

            System.out.println(
                "Warnings: " + warningCount
            );

            System.out.println(
                "Failed logins: " + loginFailures
            );

            System.out.println();

            if (loginFailures >= 3)
            {
                System.out.println(
                    "ALERT: Multiple failed login attempts detected!"
                );
            }
            else
            {
                System.out.println(
                    "No suspicious login activity detected."
                );
            }
        }
        catch (IOException e)
        {
            System.out.println(
                "Could not read the log file."
            );
        }
    }
}
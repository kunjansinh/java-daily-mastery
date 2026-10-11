// Name: Kunjan

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WebsiteMonitor
{
    public static void main(String[] args)
    {
        List<String> websites = List.of(
            "https://example.com",
            "https://httpbin.org/status/200",
            "https://httpbin.org/status/404"
        );

        ExecutorService executor =
            Executors.newFixedThreadPool(3);

        HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(5))
            .build();

        System.out.println("================================");
        System.out.println("        WEBSITE MONITOR");
        System.out.println("================================");

        try
        {
            List<Future<String>> results = websites.stream()
                .map(url -> executor.submit(() ->
                    checkWebsite(client, url)))
                .toList();

            for (Future<String> result : results)
            {
                System.out.println(result.get());
                System.out.println("--------------------------------");
            }
        }
        catch (Exception e)
        {
            System.out.println(
                "Could not retrieve a monitoring result."
            );
        }
        finally
        {
            executor.shutdown();
        }
    }

    private static String checkWebsite(
        HttpClient client,
        String url)
    {
        long startTime = System.nanoTime();

        try
        {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofSeconds(10))
                .GET()
                .build();

            HttpResponse<Void> response = client.send(
                request,
                HttpResponse.BodyHandlers.discarding()
            );

            long elapsedMillis =
                (System.nanoTime() - startTime) / 1_000_000;

            int status = response.statusCode();

            String assessment =
                status >= 200 && status < 400
                    ? "HTTP response received successfully"
                    : "HTTP error response";

            return "URL: " + url
                + "\nStatus: " + status
                + "\nResponse time: " + elapsedMillis + " ms"
                + "\nResult: " + assessment;
        }
        catch (Exception e)
        {
            long elapsedMillis =
                (System.nanoTime() - startTime) / 1_000_000;

            return "URL: " + url
                + "\nResponse time: " + elapsedMillis + " ms"
                + "\nResult: Request failed"
                + "\nReason: " + e.getClass().getSimpleName();
        }
    }
}
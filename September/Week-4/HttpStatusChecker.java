// Name: Kunjan

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpStatusChecker
{
    public static void main(String[] args)
    {
        String url = "https://example.com";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        try
        {
            HttpResponse<String> response =
                    client.send(
                            request,
                            HttpResponse.BodyHandlers.ofString()
                    );

            System.out.println("==============================");
            System.out.println("       HTTP STATUS CHECK");
            System.out.println("==============================");

            System.out.println("URL: " + url);
            System.out.println("Status Code: " + response.statusCode());

            if (response.statusCode() == 200)
            {
                System.out.println("Website is reachable.");
            }
            else
            {
                System.out.println("Website returned an unexpected status.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Request failed.");
            System.out.println("Error: " + e.getMessage());
        }
    }
}
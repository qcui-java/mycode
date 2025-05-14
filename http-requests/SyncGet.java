/* Make an HTTP Request with JDK 21
   Synchronous Get */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class SyncGet {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 1. Create an HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // 2. Build the HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://api.open-notify.org/astros.json")) // Replace with your API endpoint
                .header("Content-Type", "application/json") // Example header
                .GET() // or .POST(BodyPublishers.ofString("your request body")) for POST requests
                .build();

        // 3. Send the request and handle the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 4. Process the response
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
    }
}


/* Make an HTTP Request with JDK 21
   Synchronous Get and write out to a file */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class SyncGetFile {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 1. Create an HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // 2. Build the HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://api.open-notify.org/astros.json")) // Replace with your API endpoint
                .header("Content-Type", "application/json") // Example header
                .GET() // GET request
                .build();

        // 3. Send the request and handle the response
        HttpResponse<Path> response = client.send(request, 
                HttpResponse.BodyHandlers.ofFile(Paths.get("body.txt"))); // Corrected BodyHandlers usage

        // 4. Process the response
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response saved to file: " + response.body().toAbsolutePath());
    }
}


/* Make an HTTP Request with JDK 21
   Synchronous Get, display specific headers, and write response to a file */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class SyncGetSelectHeaders {

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
                HttpResponse.BodyHandlers.ofFile(Paths.get("body.txt"))); // Save response body to file

        // 4. Process the response
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response saved to file: " + response.body().toAbsolutePath());

        // 5. Display specific response headers
        System.out.println("\nResponse Headers:");
        displaySpecificHeaders(response, "Content-Type", "Content-Length", "Date");
    }

    // Method to display only specific headers
    private static void displaySpecificHeaders(HttpResponse<?> response, String... headerNames) {
        for (String headerName : headerNames) {
            List<String> headerValues = response.headers().allValues(headerName);
            if (!headerValues.isEmpty()) {
                System.out.println(headerName + ": " + String.join(", ", headerValues));
            } else {
                System.out.println(headerName + ": Not Present");
            }
        }
    }
}



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOLabTwo {
    public static void main(String[] args) {
        System.out.println("Java File I/O Lab");
        readFile("input.txt");
    }

    public static void readFile(String filename) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}


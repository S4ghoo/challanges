import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    // Method to read file content using try-with-resources
    public static void readFile(String filename) {
        // Try-with-resources to automatically close BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (IOException e) {
            // Catch block for handling IOException, including file not found
            System.out.println("File not found or could not be read.");
        }
    }

    public static void main(String[] args) {
        // Test case: existing file
        readFile("testfile.txt"); // Expected Output: (Contents of the file)
        
        // Test case: non-existent file
        readFile("nonexistent.txt"); // Expected Output: File not found or could not be read.
    }
}

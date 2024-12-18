package CoreJava;

import java.io.*;

public class SourceToDestFileDataCopied {
    public static void main(String[] args) {
        // Source and destination file paths
        String sourceFile = "E:\\eclipseworkspace\\javanewdemos\\APJFSA_N1\\Source.txt";
        String destinationFile = "E:\\eclipseworkspace\\javanewdemos\\APJFSA_N1\\destination.txt";

        // FileReader for reading and FileWriter for writing
        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {

            // Variable to hold each character read
            int character;

            // Read character by character and write to destination file
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.err.println("Error in reading/writing file: " + e.getMessage());
        }
    }
}
//output:File copied successfully!
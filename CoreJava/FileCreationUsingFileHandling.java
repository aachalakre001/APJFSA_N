package CoreJava;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreationUsingFileHandling {
	public static void main(String[] args) {
		// File name
		String fileName = "E:\\eclipseworkspace\\javanewdemos\\APJFSA_N1\\NewFile.txt";

		try {
			// Create a File object
			File file = new File(fileName);

			// Check if the file already exists
			if (file.createNewFile()) {
				System.out.println("File created: ");
			} else {
				System.out.println("File already exists.");
			}

			// Add data to the file using FileWriter
			FileWriter writer = new FileWriter(file);
			writer.write("Hello, this is source file");
			writer.write("Adding data in the file.");
			writer.close();


		} catch (IOException e) {
			System.err.println("An error occurred: " + e.getMessage());
		}
	}
}
//output:File created: 


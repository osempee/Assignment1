package Week4;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

    public class WriteSummaryToFile {
        public static void main(String[] args) {
            // Specify the file path
            String filePath = "path/to/your/my_summary.txt";

            // Create a File object
            File file = new File(filePath);

            try (FileWriter fileWriter = new FileWriter(file);
                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

                // Write your summary to the file
                bufferedWriter.write("Hello! I am ChatGPT, a language model created by OpenAI.");
                bufferedWriter.newLine();
                bufferedWriter.write("I'm here to assist you with any questions you may have.");

                System.out.println("Summary written to: " + file.getAbsolutePath());

            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        }
    }


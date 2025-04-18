import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriterFileTxt {


        public static void main(String[] args) throws IOException {
            FileWriter fw = new FileWriter("C:\\SeleniumPractice\\Test123.txt"); // File path
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Selenium with Java"); // Write data
            bw.newLine(); // Move to the next line
            bw.write("Selenium with Python");
            bw.newLine();
            bw.write("Selenium with C#");

            System.out.println("Finished!!!!!");
            bw.close(); // Close the writer
        }
    }




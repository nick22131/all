import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class p049WriteDataToTextFile {
    public static void main(String[] args){
        String path = "D:\\t.txt";
         try(BufferedWriter wr = new BufferedWriter(new FileWriter(path))){
             wr.write("hello");
             wr.newLine();
             wr.write(" golu molu");
             wr.newLine();
             wr.write("yeda");
             System.out.print("Data Written successfully");
         }
         catch (IOException e ) {
             System.err.print("An error ocurred while writing data" + e.getMessage());
             e.printStackTrace();
         }
    }
}
/* import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {
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

*/
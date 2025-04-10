import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main( String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\g.txt" );
        BufferedReader bf = new BufferedReader(fr);
        String read;
        while((read = bf.readLine()) != null){
            System.out.println(read);

        }
    bf.close();
    }
}
/* import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        // FileReader: Reads text from a file in the default encoding.
        // It reads character by character.
        FileReader fr = new FileReader("D:\\g.txt");

        // BufferedReader: Wraps around FileReader to read chunks of data at once.
        // Improves efficiency by reducing the number of I/O operations.
        BufferedReader bf = new BufferedReader(fr);

        String read;
        // Read each line from the file until the end (null) is reached.
        while ((read = bf.readLine()) != null) {
            System.out.println(read); // Print each line to the console.
        }

        // Close the BufferedReader to release system resources.
        bf.close();
    }
}*/
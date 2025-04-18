import java.io.FileReader;
import java.io.IOException;

public class p09ThrowsExample {
    public static void main(String[] args){
        try {
            readFile();
        }
        catch (IOException e){
            System.out.print("Handled Exception :  " +  e );
        }

    }
    static void readFile() throws IOException {
         FileReader file = new FileReader(" text.txt");

    }
}

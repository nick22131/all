import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class p047BufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fl = new FileReader("D:\\g.txt ");
        BufferedReader br = new BufferedReader(fl);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}

package basics.pract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class p048_BufferdReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\go\\Downloads\\cookies.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
   br.close();
    }
}

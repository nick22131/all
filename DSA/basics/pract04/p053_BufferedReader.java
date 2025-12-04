package basics.pract04;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class p053_BufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fr  = new FileReader("C:\\Users\\gov\\Downloads\\text\\reddit.txt");
        BufferedReader bf = new BufferedReader(fr);
        String line;
        while ((line = bf.readLine() )!= null){
            System.out.println(line);
        }
        bf.close();
    }
}

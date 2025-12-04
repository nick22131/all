package basics.pract04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class p055_WritingDataToTextToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\gov\\Documents\\All\\golu.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("glolu molu");
        bw.newLine();
        bw.write("molu golu");
        bw.flush();
        bw.close();
    }
}

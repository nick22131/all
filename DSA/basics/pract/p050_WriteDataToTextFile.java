package basics.pract;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class p050_WriteDataToTextFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\go\\Downloads\\sfs.txt"  );
        BufferedWriter bw = new BufferedWriter(fw)  ;
        bw.write("It has now almost reached the $1.1 trillion mark");
        bw.newLine();
        bw.write("People are spending much more than they can afford…");
        bw.flush();
        bw.close();
    }
}

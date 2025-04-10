import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p048ReadingDataFromTextFileScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File fl = new File ("D:\\g.txt");
        Scanner sc = new Scanner(fl);
       while(sc.hasNextLine()){
           System.out.println(sc.nextLine());
       }
       sc.close();
    }

}

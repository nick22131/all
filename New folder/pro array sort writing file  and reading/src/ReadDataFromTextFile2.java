import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fle= new File ("D:\\g.txt ");
        Scanner sc = new Scanner(fle);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

}

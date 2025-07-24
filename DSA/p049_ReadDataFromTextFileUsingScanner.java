import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class p049_ReadDataFromTextFileUsingScanner  {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\go\\Downloads\\cookies.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

}

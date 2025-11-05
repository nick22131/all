package basics.pract04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class p054_ReadingFileUsingScanner {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\gov\\Downloads\\text\\reddit.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine()    );
        }

    }
}

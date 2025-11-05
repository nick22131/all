package basics.pract04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p056_WritingDataToTextFilePrompting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to write or exite to end: ");
        try{
            FileWriter fw = new FileWriter("C:\\Users\\gov\\Documents\\All\\golu.txt"   );
            BufferedWriter bw = new BufferedWriter(fw);
            while(true){
                System.out.print(" >> ");
                String line = sc.nextLine();
                if(line.equalsIgnoreCase("exit")){
                    break;
                }
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
            bw.close();
            System.out.print("\n data Written successful");
        }catch(IOException io){
            System.out.print("\n  unsuccessfull");
            io.printStackTrace();
        }
        finally{
            sc.close();
        }

    }
}

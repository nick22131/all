import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p063BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter text to write to file: ");
        String input = sc.nextLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\g.txt"));
        bw.write(input);
        bw.flush();
        bw.close();
        sc.close();
        System.out.println("Data is written to File");

    }
}

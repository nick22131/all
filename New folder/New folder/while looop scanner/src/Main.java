import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner qu = new Scanner(System.in);
        String input = "" ;
        while (!input.equals("quit")){
            System.out.print("Input: ");
            input = qu.next().toLowerCase();

 System.out.println(input);       }

    }
}

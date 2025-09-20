package basics;

import java.util.Scanner;

public class p047_ReverseEachWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter sentense to reverse:   ");
        String input = sc.nextLine();
        String [] element = input.split(" ");
        String rev = "" ;
        for(String m : element){
            StringBuilder sb = new StringBuilder(m);
            sb.reverse();
            rev = rev + sb.toString() + " ";
        }
        System.out.print("\n Reversed String is : " + rev.trim());
    }
}

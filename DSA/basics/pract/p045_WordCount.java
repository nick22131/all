package basics.pract;

import java.util.Scanner;

public class p045_WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence to count words: ");
        String input = sc.nextLine();
        int count = 1;
        for (int i = 0; i < input.length()-1; i++){
            if((input.charAt(i)== ' ') && (input.charAt(i+1) != ' ')){
                count++;
            }
        }
        System.out.print("\n Number of words r : " + count);
    }

}

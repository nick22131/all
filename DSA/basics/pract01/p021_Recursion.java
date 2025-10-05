package basics.pract01;

import java.util.Scanner;

public class p021_Recursion {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many time to print: ");
        int input = sc.nextInt();
        sayHi(input);

    }

    static void sayHi(int m){
        System.out.println("Hello");
        if(m < 0){
            return;
        }
        sayHi(m - 1);
    }

}

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

        if(m == 0){
            return;
        }

        System.out.println("Hello");
        sayHi(m - 1);
    }

}

package basics.pract02;

import java.util.Scanner;

public class p021_Recursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many time to Print: ");
        int input = sc.nextInt();
        sayHi(input);
        sc.close();

    }
    static void sayHi(int m){

        if(m <= 0){
            return;
        }

        System.out.println("Hi golu molu");

        sayHi(m-1);
    }
}

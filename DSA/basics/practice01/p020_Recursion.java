package basics.practice01;

import java.util.Scanner;

public class p020_Recursion {
    public static void main(String [ ] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" How many times to print : ");
        int m = sc.nextInt();
        sayHi(m);
    }
    static void sayHi(int m){
        System.out.println("Hi");
        if(m < 0){
            return;
        }
        sayHi(m-1);
    }
}

package basics.pract;

import java.util.Scanner;

public class p020_Recursion {
    public static void main(String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times to Print: ");
        int m = sc.nextInt();
        sayHi(m);
        sc.close();
    }
    static void sayHi(int m ){
        System.out.print("Golu Mollu");
        if(m <= 0){
            return;

        }
        sayHi(m-1);
    }
}

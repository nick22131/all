import java.util.Scanner;

public class p018RecursionTutorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times you want print:  ");
        int n = sc.nextInt();
        sayHi(n);
        sc.close();
    }
 private static void sayHi(int m){
     System.out.print(" hi ! ");
     if(m <= 1){
         return;
     }
     sayHi(m - 1);
 }
}

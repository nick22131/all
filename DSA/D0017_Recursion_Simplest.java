import java.util.Scanner;

public class D0017_Recursion_Simplest {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("how many times you want to print : ");
        int n = sc.nextInt();
      sayHi(n);
      sc.close();
    }
    static void sayHi(int n){
        System.out.print("\n Hi!");

        if(n<=1){
            return;
        }
        sayHi(n-1);
    }
}


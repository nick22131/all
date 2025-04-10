import java.util.Arrays;
import java.util.Scanner;

public class p037SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int [] a = new int [ele.length];
        for(int i = 0; i < ele.length ; i++ ){
            a[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("entered array is: " + Arrays.toString(a));
        int sum = 0 ;
         for (int i = 0 ; i < a.length ; i++){
             sum = sum + a[i];
         }
         System.out.println("\n" + sum );
       }
}

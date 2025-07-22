import java.util.Random;
import java.util.Scanner;

public class p036_ArraySelectionSortRandomInput {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number of Elements in Array: ");
        int input = sc.nextInt();
        Random ran = new Random();
        int[] array = new int[input];
        for(int i = 0 ; i < input ; i++){
          array[i] = ran.nextInt(1000);
        }
    }
}

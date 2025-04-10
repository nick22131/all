import java.util.Arrays;
import java.util.Scanner;

public class p003ScannerArray2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of an array:" );
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.print("\n enter the array elements :");
        for(int i = 0; i< n ; i++){
            array[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(array));
    }
}

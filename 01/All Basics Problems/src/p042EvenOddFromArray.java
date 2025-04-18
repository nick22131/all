import java.util.Arrays;
import java.util.Scanner;

public class p042EvenOddFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] a = new int[ele.length];
        for (int i = 0; i < ele.length; i++) {
            a[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("enterd array is : " + Arrays.toString(a));
        System.out.print("\n even no : ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.print("\n odd number is :  ");
        for(int i= 0; i < a.length; i++){
            if(a[i] % 2 != 0){
                System.out.print(a[i] +" ");
            }
        }

    }
}
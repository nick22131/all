import java.util.Scanner;
import java.util.Arrays;

public class CheckArraysEqual {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of elements for both arrays: ");
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }

        boolean status = Arrays.equals(a1, a2);
        if (status) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are NOT Equal");
        }
        sc.close();
    }
}
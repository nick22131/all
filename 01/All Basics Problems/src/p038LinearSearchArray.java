import java.util.Arrays;
import java.util.Scanner;

public class p038LinearSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] a = new int[ele.length];
        for (int i = 0; i < ele.length; i++) {
            a[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("entered array is : " + Arrays.toString(a));
        System.out.print("\n enter element to search : ");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.print("element found at index :" + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.print(" element not found");
        }
        sc.close();
    }
}
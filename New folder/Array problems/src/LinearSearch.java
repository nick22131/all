import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter elements ");
        String inp = sc.nextLine();
        String[] ele = inp.split(" ");
        int[] arr = new int[ele.length];
        for (int i = 0; i < ele.length; i++) {
            arr[i] = Integer.parseInt(ele[i]);
        }
        System.out.print(" \narray is :");
        for (int num : arr) {
            System.out.print(num + " "); }

            System.out.print( " enter elements to search : ");
                    int n = sc.nextInt();
             boolean flag = false;
             for ( int i = 0; i < arr.length; i++){
                 if(arr[i] == n ){
                     System.out.print("element found at index; " + i);
                     flag = true;

                 }
             }

            if (!flag) {
                System.out.println("Element Not Found");
            }


    }
}
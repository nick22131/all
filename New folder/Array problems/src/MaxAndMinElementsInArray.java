import java.util.Scanner;

public class MaxAndMinElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter elem wt space: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] arr = new int[ele.length];
        for (int i = 0; i < ele.length; i++) {
            arr[i] = Integer.parseInt(ele[i]);
        }
        System.out.print(" array ele r : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.print(" max:" + max + "  min:" + min);
    }}

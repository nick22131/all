import java.util.Arrays;
import java.util.Scanner;

public class p029SortingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int [] array = new int [ele.length];
        for (int i = 0; i < ele.length; i++){
            array [i] = Integer.parseInt(ele[i]);
        }
        System.out.print(" \n array is : ");
        for(int i : array){
            System.out.print(i + " ");
        }
        Arrays.sort(array);
        System.out.print("\n Sorted array is : ");
        for(int i : array){
            System.out.print(i + " ");
        }
    }
}

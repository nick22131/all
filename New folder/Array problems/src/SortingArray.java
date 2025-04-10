import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the array ele with spaces:  ");
        String iput = sc.nextLine();

        String[] ele = iput.split(" ");
        int[] Arr = new int[ele.length];
        for (int i = 0 ; i < ele.length; i++) {
            Arr[i] = Integer.parseInt(ele[i]);
        }

            System.out.print("arr ele r : ");
            for (int c = 0; c < Arr.length; c++){
                System.out.print(Arr[c] + " "); }
             
                Arrays.sort(Arr);
                System.out.print("sorted array: ");
                for (int j = 0; j < Arr.length; j++){
                    System.out.print(Arr[j] + " ");
                }
                sc.close();
            }
     }





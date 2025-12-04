package basics.pract01;

import java.util.Arrays;
import java.util.Scanner;

public class p009_ReverseArrayFromGivenPosition {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] array = new int[ele.length];
        for(int i = 0; i < ele.length; i++){
            array[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("Entered ARray is : "+ Arrays.toString(array));
        System.out.println("Entered from where array to Reverse: ");
        int pos = sc.nextInt();
        reverseArray(array,pos);
        System.out.println("Reverse Is :  " + Arrays.toString(array));
    }

    static void reverseArray(int[] array , int pos){
        int low = pos;
        int high = array.length - 1;
        while(low < high){
            int temp = array[low ];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }

}

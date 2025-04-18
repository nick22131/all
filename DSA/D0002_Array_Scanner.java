import java.util.Arrays;
import java.util.Scanner;

public class D0002_Array_Scanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[ ] array = new int[ele.length];
        for(int i = 0; i < ele.length; i++){
            array[i] = Integer.parseInt(ele[i]);
        }
        System.out.println("entered array is : " + Arrays.toString(array));
    }
}

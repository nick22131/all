import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class p036SortObjectarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elements :");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        Integer [ ] a = new Integer[ele.length];
        for(int i = 0 ; i < ele.length; i++){
            a[i] = Integer.parseInt(ele[i]);
        }
        System.out.print(" entered array is : " + Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.print(" entered array is : " + Arrays.toString(a));

    }
}
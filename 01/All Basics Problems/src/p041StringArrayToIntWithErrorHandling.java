import org.apache.commons.lang3.IntegerRange;

import java.util.Arrays;
import java.util.Scanner;

public class p041StringArrayToIntWithErrorHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers Seperated by spaces(e.g.,'4 5 6' ) :");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int [] a = new int[ele.length ];
        for(int i = 0; i < ele.length; i ++){
            try {
                a[i] = Integer.parseInt(ele[i]);
            }
            catch (NumberFormatException e ){

                System.out.print("\ninvalid input: "+ a[i] + "  is not a number Skipping..." );
                a[i]= 0 ;

            }
        }
        System.out.print("\nentered array is :" + Arrays.toString(a));
        sc.close();
    }
}

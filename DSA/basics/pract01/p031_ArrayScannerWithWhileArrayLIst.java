package basics.pract01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p031_ArrayScannerWithWhileArrayLIst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements or done to exit : ");
        List<Integer> list = new ArrayList<>();

        while(sc.hasNext()){
            if(sc.hasNextInt()){
                list.add(sc.nextInt());
            }else{
                String input = sc.next();
                if(input.equalsIgnoreCase("done")){
                    break;

                }else{
                    System.out.println("Invalid input " );
                }

            }

        }
        int[] array  = new int[list.size()];
        for (int i = 0 ; i < list.size(); i++){
            array[i] = list.get(i);
        }
        System.out.print("\n enterd array Is :  " + Arrays.toString(array));
    }
}

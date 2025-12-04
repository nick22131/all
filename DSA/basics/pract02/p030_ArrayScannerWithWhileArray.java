package basics.pract02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p030_ArrayScannerWithWhileArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elem or done for exit: ");
        List<Integer> arrayList = new ArrayList<>();
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                arrayList.add(sc.nextInt());
            }else{
                String input = sc.next();
                if(input.equalsIgnoreCase("done")){
                    break;
                }else {
                    System.out.print("\n invalid input");
                }
            }
        }
        int[] array = new int[arrayList.size()];
        for(int i = 0 ; i < arrayList.size(); i ++){
            array[i] = arrayList.get(i);
        }
        System.out.print("\n array is : " + Arrays.toString(array));
    }
}

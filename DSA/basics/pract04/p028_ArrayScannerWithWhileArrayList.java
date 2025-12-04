package basics.pract04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p028_ArrayScannerWithWhileArrayList {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array elements And done to exit:  ");
        List<Integer> arrayList = new ArrayList<>();
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                arrayList.add(sc.nextInt());
            }else{
                String input = sc.next();
                if(input.equalsIgnoreCase("done")){
                    break;
                } else {
                    System.out.print("\n Invalid input");
                }
            }
        }
        int[] array = new int[arrayList.size()];
        for(int i = 0 ; i< arrayList.size(); i++){
            array[i] = arrayList.get(i);
        }
        Utility.printArray(array);
    }
}

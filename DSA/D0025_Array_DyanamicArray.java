import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D0025_Array_DyanamicArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter Integer array Elememt (Type done when finished):  ");
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                arr.add(sc.nextInt());
            }else{
                String input = sc.next();
                if(input.equalsIgnoreCase("done")){
                    break;
                }else{
                    System.out.print("\n Invalid input . Enter number or type 'done' to finish");
                }
            }
        }

        int[ ]arrays = new int[arr.size()];
        for(int i = 0; i< arr.size(); i++){
            arrays[i] = arr.get(i);
        }
        System.out.print("\n Enterd array is : " + Arrays.toString(arrays));
    }
}

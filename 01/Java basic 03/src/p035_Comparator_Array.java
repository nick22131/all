import java.util.Arrays;

public class p035_Comparator_Array {
    public static void main(String[] args)  {
        Integer [] arr = {3,5,1,5,2,6,1};
        Arrays.sort(arr, (c1 , c2) -> c1 - c2);
        for(int c : arr){
            System.out.print(" " +c);
        }
    }
}

import java.util.Arrays;

public class p08_ReverseArrayFromGivenPosti {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int array[] = Utility.getArray(size);
        System.out.print("\n enter position from where to revese :");
        int pos = Utility.getNum();
        reverseArray(array, pos);
        System.out.print("\n reverse array is : " + Arrays.toString(array));
    }

    private static void reverseArray(int[] array , int pos){

        int high = array.length-1;
        int low = pos;
        int tem = 0;
        while (low < high ){
            tem = array[low];
            array[low]
        }

    }
}

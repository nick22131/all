package basics.pract03;

public class p008_ReverseArrayFromGivenPosition {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);
        System.out.print("\n Enter from which array to reverse: ");
        int pos = Utility.getNumber();
        reverseArray(array,pos);
        Utility.printArray(array);

    }

    static void reverseArray(int[] array, int pos){
        int low = pos;
        int high = array.length - 1;
        int tem = 0;
        while(low < high){
            tem = array[low];
            array[low] = array[high];
            array[high] = tem;
            low ++ ;
            high --;
        }
    }
}

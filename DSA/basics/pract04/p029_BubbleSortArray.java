package basics.pract04;

public class p029_BubbleSortArray {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[ ] array = Utility.getArray(size);
        Utility.printArray(array);
        bubbleSort(array);
        Utility.printArray(array);
    }

    private static void bubbleSort(int[] array){
        int size = array.length;
        int tem = 0;
        boolean swapped ;
        for(int i = 0 ; i < size; i ++){
            swapped = false;
            for(int j = 0; j < size - i - 1; j++){
                if(array[j] > array[j+1]){
                    tem = array[j]  ;
                    array[j] = array[j+1];
                    array[j+1] = tem;
                    swapped = true ;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}

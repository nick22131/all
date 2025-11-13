package basics.pract04;

public class p031_InsertionSort {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size );
        Utility.printArray(array);
        insertionSort(array);
        System.out.println("after sortiog : ");
        Utility.printArray(array);
    }

    private static void insertionSort(int[] array){
        int size = array.length;
        for(int i = 1; i < size; i++){
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j]  ;
                j--;
            }
            array[j+1] = key;
        }
    }
}

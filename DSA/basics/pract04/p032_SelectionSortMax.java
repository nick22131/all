package basics.pract04;

public class p032_SelectionSortMax {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size );
        Utility.printArray(array);

        selectionSort(array);

        System.out.println("sorted : ");
        Utility.printArray(array);
    }

    static void selectionSort(int[ ] array){
        int size = array.length;
        int tem = 0;
        int maxIndex ;
        for(int i = 0; i < size - 1; i++){
            maxIndex = i;
            for(int j = i+1; j < size ;j ++){
                if(array[maxIndex] < array[j]){
                    maxIndex = j;
                }
            }
            tem = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = tem;
        }
    }
}

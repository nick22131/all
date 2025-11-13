package basics.pract04;

class p030_ArraySelectionSort {
    public static void main(String[] args) {
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);

        selectionSort(array);
        System.out.println();
        Utility.printArray(array);

    }

   private static void selectionSort(int[] array){
        int size = array.length;
        int tem = 0;
        int minIndex =0;
        for(int i = 0 ; i < size -1; i++){
            minIndex = i;
            for (int j = i + 1; j < size; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            tem = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tem;
        }
    }

}

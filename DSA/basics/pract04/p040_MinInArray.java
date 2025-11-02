package basics.pract04;

public class p040_MinInArray {
    public static void main(String[] args) {
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);
        int min = minInArray(array);
        System.out.print(" \n min in array : " + min);
    }

    static int minInArray(int [] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }

        }
        return min;
    }
}

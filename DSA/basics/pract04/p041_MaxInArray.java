package basics.pract04;

public class p041_MaxInArray {
    public static void main(String[] args) {
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);
        int max = maxInArray(array);
        System.out.print("\n Max in array is : " + max);

    }

    private static int maxInArray(int [] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
}

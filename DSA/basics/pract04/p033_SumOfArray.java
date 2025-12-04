package basics.pract04;

public class p033_SumOfArray {
    public static void main(String[] args ){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);
        int sum = 0;
        for(int i = 0 ; i < size; i++){
            sum = sum + array[i];
        }

        System.out.print("\n Sum of array is : " + sum);
    }
}

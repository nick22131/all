package basics.pract04;

public class p035_LinearSearchArray {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);
        System.out.println("element to find "   );
        int target = Utility.getNumber() ;

        int index = linearSearch(array, target);
        System.out.print("element found at : " + index);

    }

    private static int linearSearch(int[] array, int target) {
        if(array.length == 0){
            return -1;
        }

        for (int i = 0; i < array.length ; i++) {
             if(target == array[i]){
                 return i;
             }
        }

        return -1;

    }
}

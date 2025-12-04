package basics.pract04;

public class p039_LinearSearchRange {
    public static void main(String[] args) {
        int size = Utility.getArraySize();
        int[] array= Utility.getArray(size);
        Utility.printArray(array);
        System.out.println("enter element and rang to find ");
        int target = Utility.getNumber();
        System.out.println("min ");
        int min = Utility.getNumber();
        System.out.println("max "   );
        int max = Utility.getNumber();
        boolean isFound = linearSearch(array,target,min,max);
        System.out.println("found element in range : " + isFound);
    }

    static boolean linearSearch(int[] array, int target, int min , int max){
        if(array.length == 0){
            return false;
        }
        for(int i = min; i <= max; i++){
            if(target == array[i]){
                return true;
            }
        }
        return false;
    }
}

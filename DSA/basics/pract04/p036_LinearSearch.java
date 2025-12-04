package basics.pract04;

public class p036_LinearSearch {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);
        System.out.println("element to search: " );
        int target = Utility.getNumber();
        int element = linearSearch(array, target);
        System.out.print("\n element found : " + element);
    }
    static int linearSearch(int[] array , int target){
        if(array.length == 0){
            return -1;
        }
        for(int n : array){
            if(n == target){
                return n;
            }
        }
        return -1;
    }
}

package basics.pract04;

public class p034_LinearSearchArray {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int [] array = Utility.getArray(size);
        Utility.printArray(array);
        System.out.println("element to Search : ");
        int target = Utility.getNumber();

        linearSearch(array,target)  ;

    }

    static void linearSearch(int[] array, int target){
        boolean flag = false;
        for(int i = 0; i < array.length; i++){
            if(target == array[i]){
                System.out.print("\n element found at index: " + i);
                flag = true ;
                break;
            }
        }
        if(!flag){
            System.out.print("\n element not found ");
        }
    }
}

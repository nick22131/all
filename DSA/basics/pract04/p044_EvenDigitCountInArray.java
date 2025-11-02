package basics.pract04;

public class p044_EvenDigitCountInArray {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);
        int eCount = evenCountInArray(array);
        System.out.print("\n Even Digit Elements in Array: "+ eCount);
    }

    static int evenCountInArray(int[] array){
        int eCount = 0;
        for(int i = 0; i < array.length; i++){
            if(isEvenDigit(array[i])){
                eCount++;
            }
        }
        return eCount;
    }

    static boolean isEvenDigit(int input){
        int count = 0;
        while (input >0){
               input = input / 10;
               count ++;
        }
        return (count % 2 == 0);
    }

}

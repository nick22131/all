package basics.pract04;

public class p047_EvenOrOddArrayElements {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[]array = Utility.getArray(size);

        System.out.print("\n Even Elements : ");
        for(int n : array){
             if(n % 2 == 0){
                 System.out.print(" " + n);
             }
        }

        System.out.print("\n Odd Element: ");
        for(int n : array){
            if(n % 2 != 0){
                System.out.print(" " + n);
            }
        }
    }
}

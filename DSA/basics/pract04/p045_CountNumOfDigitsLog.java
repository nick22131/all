package basics.pract04;

public class p045_CountNumOfDigitsLog {
    public static void main(String[] args){
        int input = Utility.getNumber();
        int count = (int )Math.log10(input) + 1 ;
        System.out.print("\n Num of Digits " + count);
    }
}

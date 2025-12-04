package basics.pract03;

public class p013_CountingEvenOddDigitUntilNum {
    public static void main(String[] args){
        int input  = Utility.getNumber();
        int oCount = 0;
        int eCount = 0;
        for (int i = 1; i <=input ; i++) {
            if(i % 2 == 0){

                eCount++;
            }else {
                oCount++;
            }

        }
        System.out.print("\n Odd count : " + oCount
        +"\n Even Count : " + eCount);
    }
}

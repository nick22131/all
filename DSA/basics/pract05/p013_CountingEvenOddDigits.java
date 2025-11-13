package basics.pract05;

public class p013_CountingEvenOddDigits {
    public static void main(String[] args){
        int input = Utility.getNum();
        int oCount = 0 , eCount = 0;
        while(input > 0){
            int digit = input % 10;
            if(digit % 2 == 0){
                eCount++;
            }else{
                oCount++ ;
            }
            input = input / 10;
        }
        System.out.print("\n Even count:  " + eCount + "\n Odd Count : " +oCount)   ;
    }
}

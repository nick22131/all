package basics.pract04;

public class p013_CountingEvenOddDigits {
    public static void main(String[] args) {
        int input = Utility.getNumber();
        int oCount = 0;
        int eCount = 0;
        while (input > 0){
            int digit = input % 10;
            if(digit % 2 == 0){
                eCount++;
            }else{
                oCount++;
            }
            input = input / 10;
        }
        System.out.print("\n Odd Count is : " + oCount + " \n Even Count : " + eCount);
    }
}

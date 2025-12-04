package basics.pract04;

public class p014_EvenOddCountingUntilNum {
    public static void main(String[] args) {
        int input = Utility.getNumber();
        int oCount = 0;
        int eCount = 0;
        for (int i = 1; i <= input ; i++) {
            if(i % 2 == 0){
                eCount ++;
            }else{
                oCount++;
            }

        }
        System.out.print("\n Even count : " +eCount + "\n Odd count : " + oCount);
    }
}

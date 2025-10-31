package basics.pract04;

public class p005_CountNumberOfDigits {
    public static void main(String[] args){
        int input = Utility.getNumber();
        int count = 0;
        while(input > 0){
            input = input / 10;
            count++;
        }
        System.out.print("\n Num of digits are : " + count);
    }
}

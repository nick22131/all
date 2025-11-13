package basics.pract05;

public class p005_CountingNumOfDigits {
    public static void main(String[] args){
        int input = Utility.getNum();
        int count = 0;
        while(input > 0){
            input = input / 10;
            count++;
        }
        System.out.print("\n Num of digit are : " + count);
    }
}

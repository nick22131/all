public class p05_CountNumOfDigits {
    public static void main(String[] args){
        int input =  Utility.getNum();
        int count = 0 ;
        while (input > 0){
          input = input / 10;
          count ++ ;
        }
        System.out.print("\n count is : " + count);
    }
}

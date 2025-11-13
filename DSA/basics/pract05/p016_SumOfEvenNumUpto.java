package basics.pract05;

public class p016_SumOfEvenNumUpto {
    public static void main(String[] args){
        int input = Utility.getNum();
        int sum = 0;
        for(int i = 1; i <= input ; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.print("\n sum is : " + sum);
    }
}

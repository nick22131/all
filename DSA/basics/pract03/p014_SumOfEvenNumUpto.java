package basics.pract03;

public class p014_SumOfEvenNumUpto {
    public static void main(String[] args){
        int input = Utility.getNumber();
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            if(i % 2 == 0){
                sum = sum + i;
            }
            
        }
        System.out.print("sum is : " + sum);
    }
}

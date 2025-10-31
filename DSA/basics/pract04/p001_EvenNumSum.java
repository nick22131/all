package basics.pract04;

public class p001_EvenNumSum {
    public static void main(String[] args){
        int input = Utility.getNumber();
        int sum = 0;
        for (int i = 0; i <= input ; i++) {
            if(i % 2 == 0){
                sum = sum + i;
            }
        }

        System.out.print("\n sum is : " + sum);
    }
}

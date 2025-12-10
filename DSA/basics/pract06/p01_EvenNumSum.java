public class p01_EvenNumSum {
    public static void main(String[] args) {
        int input = Utility.getNum();
        int sum = 0;
        for(int i = 0 ; i <= input ; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.print("\n even num sum is : " + sum);
    }
}

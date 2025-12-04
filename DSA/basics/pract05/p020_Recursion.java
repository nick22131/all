package basics.pract05;

public class p020_Recursion {
    public static void main(String[] args){
        int input = Utility.getNum();
        System.out.println();
        sayHi(input);
    }
    private static void sayHi(int n){
        if(n <= 0){
            return;
        }
        System.out.println("hi");
        sayHi(n-1);
    }
}

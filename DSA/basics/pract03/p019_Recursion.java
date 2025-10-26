package basics.pract03;

public class p019_Recursion {
    public static void main(String[] args) {
        int input = Utility.getNumber();
        sayHi(input) ;
    }

    static void sayHi(int n){
        if(n <= 0){
            return;
        }
        System.out.print("\n HI ");
        sayHi(n-1);
    }
}

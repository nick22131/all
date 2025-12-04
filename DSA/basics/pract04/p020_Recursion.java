package basics.pract04;

public class p020_Recursion {
    public static void main(String[] args){
        int input= Utility.getNumber();
        sayHi(input);
    }

    static void sayHi(int n ){
        if(n <= 0){
            return;
        }
        System.out.println("HI");
        sayHi(n-1);
    }
}

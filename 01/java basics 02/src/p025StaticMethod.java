class Math1{
    static int square(int x){
        return x * x;
    }


}


public class p025StaticMethod {
    public static void main(String[] args){
        int result = Math1.square(5);
        System.out.println("Square of 5 : " + result);
    }
}

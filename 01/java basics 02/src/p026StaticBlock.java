class Example {
    static{
        System.out.println("Static Block Executed");
    }
}


public class p026StaticBlock {
    public static void main(String[] args){
        Example ex = new Example();
        System.out.println("Main method Executed");
    }
}

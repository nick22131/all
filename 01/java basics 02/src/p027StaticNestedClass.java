class Outer{
    static class Nested{
        void disply(){
            System.out.println("Static Nested class");
        }
    }
}


public class p027StaticNestedClass {
    public static void main(String[] args){
        Outer.Nested obj = new Outer.Nested();
        obj.disply();

    }
}

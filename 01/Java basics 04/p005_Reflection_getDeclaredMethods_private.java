import java.lang.reflect.Method;

class Eagle02{
    public String breed;
    private boolean canSwim;

    public void fly(){
        System.out.println("fly");
    }
    private void eat(){
        System.out.println("eat");
    }
}
// Main class
public class p005_Reflection_getDeclaredMethods_private {
    public static void main(String[] args){
   Class classobj = Eagle02.class;
   Method[] m =  classobj.getDeclaredMethods();  // also gets private methods
   for (Method n : m )  {
       System.out.println("Method Name : "+ n.getName() );
   }
    }
}

import java.lang.reflect.Method;

class Eagle01{
    public String breed ;
    private boolean canSwim;
    public void fly(){
        System.out.println("fly");
    }
    private void eat(){
        System.out.println("eat");
    }
}

//main class
public class p003_Reflection_getMethods {
    public static void main(String[] args){
        Class classobj = Eagle01.class;
        Method [] me = classobj.getMethods();
        for(Method n : me)  {
            System.out.println("method name : " + n.getName());
            System.out.println("Return Type : " + n.getReturnType());
            System.out.println("Class name:  " + n.getDeclaringClass());
            System.out.println("******")    ;
        }

    }
}

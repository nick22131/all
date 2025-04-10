import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Eagle03{
    Eagle03 (){
      // constructor
    }
    public void fly(int intParam, boolean bool, String st){
        System.out.println("fly intparam " + intParam + " bool: " + bool + "  St: "  + st);
    }
}

public class p006_Reflection_InvokingMethods {
    public static void main(String[ ] args ) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        Class objClass = Eagle03.class;
        // Create an instance of the class
        Eagle03 eagleInstance = (Eagle03) objClass.getDeclaredConstructor().newInstance();

        Method m = objClass.getMethod("fly" , int.class, boolean.class, String.class);
       m.invoke(eagleInstance, 1,true, "hello");
    }
}

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Cat{
    private final String name;
    private int age;
    public Cat(String name, int age ){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age ){
        this.age = age;
    }
    public void meow(){
        System.out.println("Meow ");
    }
    private void heyPrivate(){
        System.out.println("How did you call this? this is private ");
    }
    public static void thisIsPublicStaticMethod(){
        System.out.println(" I'm public and static ");
    }
    private static void thisIsPrivateStaticMethod(){
        System.out.println("Hey, I'm private and static!");
    }
}

public class p007_Reflection_all {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Cat myCat = new Cat("Stell", 4);
        Field[ ] catField = myCat.getClass().getDeclaredFields();
        for(Field fi : catField )   {
            if(fi.getName().equals("name")){
                fi.setAccessible(true) ;
                fi.set(myCat, "fred");

            }
        }
       System.out.println("updated name: " +myCat.getName()  );
        Method [ ] m = myCat.getClass().getDeclaredMethods();
        for(Method n : m )  {

            if(n.getName().equals("heyPrivate")){
                n.setAccessible(true);
                n.invoke(myCat);

            }

        }
    }
}

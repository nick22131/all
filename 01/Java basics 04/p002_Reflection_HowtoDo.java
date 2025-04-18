import java.lang.reflect.Modifier;

class Eagle{
    public String breed;
    private boolean canSwim;

    public void fly(){
        System.out.println("fly");
    }
    public void eat(){
        System.out.println("eat");
    }
}

// Main class
public class p002_Reflection_HowtoDo {
    public static void main(String[] args){
        Class eagleClass = Eagle.class;
                System.out.println(eagleClass.getName() );
                System.out.println(Modifier.toString(eagleClass.getModifiers()));
    }
}

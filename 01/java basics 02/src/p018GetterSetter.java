 class Person{
    private String name;
    private int age;

    // get set Name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // get set Age
     public int getAge(){
        return age;
     }
     public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else {
            System.out.print("Age must be positive");
        }
     }
}

// Main class
public class p018GetterSetter {
    public static void main(String[] args){
       Person p = new Person();
       p.setName("Alice");
       p.setAge(87);

       System.out.println("Name: " + p.getName());
       System.out.println("Age: "+ p.getAge());
    }
}

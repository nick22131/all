class Person2{
    private String name;
    private int age ;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0) {
            this.age = age;
        }
            else{
                System.out.println("Age must be positive");
            }
        }
    }





public class p033EncapsulationExample {
    public static void main(String[] args){
        Person2 p = new Person2();

        // Set values
        p.setName("Alice");
        p.setAge(76);

        // get Values
        System.out.println("Name: " + p.getName());
        System.out.println("Age : "  + p.getAge());


    }
}

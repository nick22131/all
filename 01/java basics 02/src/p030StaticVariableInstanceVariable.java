class Employee {
    static String company = "Tech Corp ";
    String name ;

    Employee(String name){
        this.name = name;
    }
    void disply(){
        System.out.println(name + " Works at " + company);
    }
}


public class p030StaticVariableInstanceVariable {
    public static void main(String[] args){
        Employee e1= new Employee("John");
        Employee e2 = new Employee("Emma");

        e1.disply();
        e2.disply();

        Employee.company = "Global Tech";
        e1.disply();
        e2.disply();
    }
}

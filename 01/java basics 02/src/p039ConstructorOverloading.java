class Employee2{
    String name;
    int age ;

    // Default Constructor
    Employee2(){
        name = "Unknown";
        age = 0 ;
    }

    // Parameterized Constructor
    Employee2 (String name ){
        this.name = name;
        this.age = 0;
    }

    Employee2 (String name, int age){
        this.name = name;
        this.age = age;
    }

    void disply(){
        System.out.println("Name: " + name + ", Age : " +  age   );
    }
}

// main class
public class p039ConstructorOverloading {
    public static void main(String[] args){
        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2("Alice");
        Employee2 e3 = new Employee2 ("Bob" , 67 );

        e1.disply();
        e2.disply();
        e3.disply();
    }
}

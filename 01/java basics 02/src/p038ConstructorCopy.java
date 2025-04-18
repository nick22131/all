class Student2{
    String name ;
    int age ;

    // Parametarized Constructor

    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Copy Constructor


    Student2(Student2 s){
        this.name = s.name;
        this.age = s.age;
    }

    void disply(){
        System.out.println("Name: " + name + ", Age : " + age );
    }
}


// Main class
public class p038ConstructorCopy {
    public static void main(String[] args ){
   Student2 s1 = new Student2( "Alice", 67 );
   Student2 s2 = new Student2(s1); // Copy Constructor

        s1.disply();
        s2.disply();

    }
}

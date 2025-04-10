class Student{
    int id;       //Instance Variable
    String name ; // Instance Variable
    static String school = "xyz School";

    Student(int id, String name){
        this.id   = id;
        this.name = name;
    }
    void disply(){
        System.out.println(id + " "+ name + " "+ school);
    }
}

// Main class
public class p024StaticVariable {
    public static void main(String[] args){
        Student s1 = new Student(1 , " Alice");
        Student s2 = new Student(2 , "Bob");

        s1.disply();
        s2.disply();

        // Changing the static variable will reflect in all objects
        Student.school = "ABC School";
        s1.disply();
        s2.disply();

    }
}

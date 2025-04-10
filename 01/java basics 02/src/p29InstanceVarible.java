class Student1{
    String name ;
}


public class p29InstanceVarible {
    public static void main(String[] args ){
        Student1 s1 = new Student1();
        s1.name = "Alice";

        Student1 s2 = new Student1();
        s2.name = " Bob ";


        System.out.println(s1.name);
        System.out.println(s2.name);
    }

}

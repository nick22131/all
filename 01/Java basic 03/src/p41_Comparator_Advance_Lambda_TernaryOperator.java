import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    Integer age;
    String name;
    Student(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString (){
        return "  " + name + " - " + age ;
    }

}

public class p41_Comparator_Advance_Lambda_TernaryOperator {
    public static void main(String[] args){
        List <Student> li = new ArrayList<>();
        li.add(new Student("Navin", 22));
        li.add(new Student("John", 12));
        li.add(new Student("Parul",18 ));
        li.add(new Student("Kiran", 20));


        Comparator<Student> st= (i,j)-> i.age > j.age ? 1 : -1;

        Collections.sort(li, st);

        for (Student s : li){
            System.out.println(s);
        }

    }
}

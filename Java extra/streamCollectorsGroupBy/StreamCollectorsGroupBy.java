package streamCollectorsGroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsGroupBy {



    public static void main(String[] args ) {

        List<Student> students = Arrays.asList(
                new Student("molu", "cs"),
                new Student("golu", "mech"),
                new Student ("tokeu", "civil"),
                new Student ("toka ", "cs")
        );

        Map<String,List<Student>> groupedStudent = students.stream()
                .collect(Collectors.groupingBy((student)-> student.getDepartment()));

        groupedStudent.forEach((department , studentsList)->{

            System.out.println(department + "  -  "  + studentsList  );

        });

    }




}

class Student{
    private String name;
    private String department;

    public Student(String name , String department){
        this.name = name ;
        this.department = department;

    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString(){
        return name;
    }

}


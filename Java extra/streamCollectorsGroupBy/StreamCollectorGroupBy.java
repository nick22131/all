package streamCollectorsGroupBy;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorGroupBy {
    public static void main(String[] args) {


        List<Student> students = Arrays.asList(
                new Student("cholu","CS"),
                new Student("aolu","CS"),
                new Student("dholu","CS"),
                new Student("toku","mech"),
                new Student("lolu","mech"),
                new Student("bolu","mech"),
                new Student("chiku","mech"),
                new Student("dito","it"),
                new Student("ctie","it"),
                new Student("tiksa","it"),
                new Student("mike","it")

        );

        Map<String,List<Student>> groupBy = students.stream()
                .collect(Collectors.groupingBy((student)-> student.getDepartment()));

        groupBy.forEach((department,listS) -> System.out.println(department  + " : " + listS));


    }
}

@Getter
class Student{
    private String name;
    private String department;

    Student(String name, String department){
        this.name = name;
        this.department = department;
    }



    @Override
   public  String toString(){
        return name;
    }
}

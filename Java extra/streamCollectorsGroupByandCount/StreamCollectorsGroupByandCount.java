package streamCollectorsGroupByandCount;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsGroupByandCount {

    public static void main (String [] args ){
        List<Student> students =  Arrays.asList(
                new Student("Amit", "CS"),
        new Student("Ravi", "IT"),
        new Student("Sita", "CS"),
        new Student("Geeta", "Mechanical"),
        new Student("Rahul", "IT"),
        new Student("Priya", "CS")
        );

        Map<String , Long > grouping = students.stream()
                .collect(Collectors.groupingBy(
                        (student) -> student.getDepartment(),
                        Collectors.counting()
                ));

                grouping.forEach((group , count ) ->
                        System.out.printlna(  count +" = " + group));


    }

}

  class Student{
    private String name ;
    private String department;

    Student(String name, String department){
        this.name = name;
        this.department = department;
    }

    String getName(){
        return name;
    }
    String getDepartment(){
        return department   ;
    }

}

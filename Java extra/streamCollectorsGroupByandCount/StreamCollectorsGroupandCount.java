package streamCollectorsGroupByandCount;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsGroupandCount {
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

        Map<String,Long> group = students
                .stream()
                .collect(Collectors.groupingBy((s)->
                        s.getDepartment(),
                        Collectors.counting()));

        group.forEach((dep,count)-> System.out.println(dep + " : " + count  ));

    }
}

@Getter
@AllArgsConstructor
class Student{
    private String name;
    private String department;
    
    @Override
    public String toString(){
        return  name;
    }
    
}
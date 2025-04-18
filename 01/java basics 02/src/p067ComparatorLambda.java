import java.util.ArrayList;
import java.util.List;

class Employee3{
    String name;
    int salary;
    Employee3(String name, int salary){
        this.name = name ;
        this.salary= salary;
    }
    @Override
    public String toString(){
        return name + "-$" + salary;
     }
}


public class p067ComparatorLambda {
    public static void main(String[] args){
        List <Employee3> li = new ArrayList<>();
        li.add(new Employee3("Alice", 50000));
        li.add(new Employee3("Bob" ,70000 ));
        li.add(new Employee3("Charlie",60000));

        //Sorting using Comparator Lambda
        li.sort((e1,e2) -> e1.name.compareTo(e2.name));

        /* employees.sort((e1, e2) -> e1.name.compareTo(e2.name)) is a shorter way of writing:
         Collections.sort(employees, new Comparator<Employee>() {
                                     public int compare(Employee e1, Employee e2) {
                                      return e1.name.compareTo(e2.name);
                                      }
                                      });*/

        System.out.println("Sorted by name:  " + li);

    }
}

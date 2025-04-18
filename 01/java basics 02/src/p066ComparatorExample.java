import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1{
    String name;
    int salary;
    Employee1(String name, int salary){
        this.name= name;
        this.salary= salary;
    }
    @Override
    public String toString(){
        return name + "-$" + salary;
    }
}

// custom comparator to sort employee by salary
class SalaryComparator implements Comparator<Employee1>{
    public int compare(Employee1 e1, Employee1 e2){
        return Integer.compare(e1.salary,e2.salary);
        /* Integer.compare(e1.salary, e2.salary) is a shorthand for:
         if (e1.salary < e2.salary) return -1; means e1 should be first
         if (e1.salary > e2.salary) return 1; means e2 should be first
          return 0; both are equal
          */
    }
}


public class p066ComparatorExample {
    public static void main(String[] args){
        List <Employee1> em = new ArrayList<>();
        em.add(new Employee1("Alice" , 50000));
        em.add(new Employee1("Bob ",70000));
        em.add(new Employee1 ("Charlie", 60000));

        //Sorting Using comparator
        Collections.sort(em, new SalaryComparator());

        System.out.println("Sorted by salary:  " + em);
    }
}

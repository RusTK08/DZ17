import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmp {
    public static void main(String[] args) {
        List<Employee> em = new ArrayList<>();
        em.add(new Employee("Alice", 30, 10000)); //// КАК ОДНО
        em.add(new Employee("Bob", 25, 40000));
        em.add(new Employee("Charlie", 35, 30000));
        Collections.sort(em);
        System.out.println(em);
        Comparator<Employee> ageComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee u1, Employee u2) {
                return u1.getSalary().compareTo(u2.getSalary());
            }
        };
        Collections.sort(em, ageComparator);
        System.out.println(em);
        
        

        
    
    
    }
    
    
}

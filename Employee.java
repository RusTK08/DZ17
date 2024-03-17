import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    String name;
    Integer age;
    Integer salary;
    public Employee(String name, Integer age, Integer salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
    }
    
    
    @Override
    public String toString(){
        return String.format("\n%s %d %d", name, age, salary);
    }


    @Override
    public int compareTo(Employee o) {
        if(age > o.age) return 1;
        else if (age < o.age) return -1;
        else return 0;
    }
    public Integer getSalary(){
        return this.salary;
    }
    
        
    
}

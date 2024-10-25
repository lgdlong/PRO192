
import java.util.Comparator;

class Employee implements Comparable {
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
       return String.format("id:%s, name:%s, salary:%d", id, name, salary);
    }
    
    @Override
    public int compareTo(Object o) {
        return id.compareTo(((Employee)o).id);
    }
    
    public static Comparator compareEmployee = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Employee e1 = (Employee) o1;            
            Employee e2 = (Employee) o2;
            
            if (e1.salary > e1.salary) {
                return -1;
            } else if (e1.salary == e2.salary) {
                return e1.id.compareTo(e2.id);
            }
            
            return 1;
        }
    };
          
}

public class Test_Netbean {
    public static void main(String[] args) {
        
    }
}
     
import java.util.Comparator;

public class ComparatorBySalary implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare((int) o1.getSalary(), (int) o2.getSalary());
    }
}

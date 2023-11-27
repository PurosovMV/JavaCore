import java.util.Iterator;
import java.util.List;

public class StaffIterator implements Iterator<Employee> {
    private int index;
    private List<Employee> employees;

    public StaffIterator(Staff list) {
        this.employees = list.getStaff();

    }

    @Override
    public boolean hasNext() {
        return employees.size() > index;
    }

    @Override
    public Employee next() {
        return employees.get(index++);
    }
}

import java.util.List;

public class Staff implements Iterable<Employee> {
    List<Employee> staff;

    public Staff(List<Employee> staff) {
        this.staff = staff;
    }

    public void addStaff(Employee employee) {
        staff.add(employee);
    }

    public List<Employee> getStaff() {
        return staff;
    }
    public void sortBySalary() {
        staff.sort(new ComparatorBySalary());
    }
    @Override
    public StaffIterator iterator() {
        return new StaffIterator(this);
    }
    @Override
    public String toString() {
        return "Staff{" +
                "staff=" + staff +
                '}';
    }
}

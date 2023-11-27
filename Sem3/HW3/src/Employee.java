public abstract class Employee implements Comparable<Employee> {


    protected String name;
    protected double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //endregion

    abstract double avgSalary();


    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", name, avgSalary());
    }
}

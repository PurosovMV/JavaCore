public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public static Worker create(String name, double salary) {
        return new Worker(name, salary);

    }
    @Override
    double avgSalary() {
        return salary;
    }
}

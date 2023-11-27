public class Freelancer extends Employee {
    public Freelancer(String name, double salary) {
        super(name, salary);
    }

    public static Freelancer create(String name, double salary) {
        return new Freelancer(name, salary);

    }

    @Override
    double avgSalary() {
        return 20.8 * 8 * salary;
    }
}

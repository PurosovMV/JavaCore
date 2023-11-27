import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = Freelancer.create("Иванов", 500);
        Employee employee2 = Freelancer.create("Смирнов", 400);
        Employee employee3 = Freelancer.create("Петров", 450);
        Employee employee4 = Worker.create("Соболев", 80000);
        Employee employee5 = Worker.create("Большов", 85000);
        Employee employee6 = Worker.create("Меньшов", 90000);


        List<Employee> staff = new ArrayList<>();
        staff.add(employee1);
        staff.add(employee2);
        staff.add(employee3);
        staff.add(employee4);
        staff.add(employee5);
        staff.add(employee6);


        Staff personal = new Staff(staff);

        System.out.println("Список  сотрудников: ");
        for (Employee employee : staff) {
            System.out.println(employee);
        }
        System.out.println();

        System.out.println("Отсортированный по имени список:");
        Collections.sort(staff);
        for (Employee employee : staff) {
            System.out.println(employee);
        }


        System.out.println();

        personal.sortBySalary();
        System.out.println("Отсортированный список по возрастанию заработной платы:");
        for (Employee employee : staff) {
            System.out.println(employee);
        }

    }
}
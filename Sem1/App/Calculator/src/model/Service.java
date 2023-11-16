package model;

import java.util.Scanner;

public class Service {
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public void run() {
        Function function = new Function();
        Scan scan = new Scan();


        System.out.println("Выбери действие:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Деление");
        System.out.println("4. Умножение");
        System.out.println();

        String input = prompt("Выберете действие: ");
        switch (input) {
            case ("1"):
                System.out.println();
                System.out.println("Результат: " + function.Addition(scan.number("Введи первое число: "), scan.number("Введи второе число: ")));
                break;
            case ("2"):
                System.out.println();
                System.out.println("Результат: " + function.Subtraction(scan.number("Введи первое число: "), scan.number("Введи второе число: ")));
                break;
            case ("3"):
                System.out.println();
                System.out.println("Результат: " + function.Division(scan.number("Введи первое число: "), scan.number("Введи второе число: ")));
                break;
            case ("4"):
                System.out.println();
                System.out.println("Результат: " + function.Multiplication(scan.number("Введи первое число: "), scan.number("Введи второе число: ")));
                break;
            default:
                System.out.println("Неизвестная команда!");
                break;

        }
    }
}

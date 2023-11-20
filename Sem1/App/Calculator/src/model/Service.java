package model;

import java.util.Scanner;

public class Service {
    private Double prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);

        return in.nextDouble();
    }

    public void run() {
        Function function = new Function();



        System.out.println("Выбери действие:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Деление");
        System.out.println("4. Умножение");
        System.out.println();

        double input = prompt("Выберете действие: ");
        switch ((int) input) {
            case (1):
                System.out.println();
                System.out.println("Результат: " + function.Addition(prompt("Введи первое число: "), prompt("Введи второе число: ")));
                break;
            case (2):
                System.out.println();
                System.out.println("Результат: " + function.Subtraction(prompt("Введи первое число: "), prompt("Введи второе число: ")));
                break;
            case (3):
                System.out.println();
                System.out.println("Результат: " + function.Division(prompt("Введи первое число: "), prompt("Введи второе число: ")));
                break;
            case (4):
                System.out.println();
                System.out.println("Результат: " + function.Multiplication(prompt("Введи первое число: "), prompt("Введи второе число: ")));
                break;
            default:
                System.out.println("Неизвестная команда!");
                break;

        }
    }
}

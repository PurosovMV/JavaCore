package model;

import java.util.Scanner;

public class Scan {

    public double number(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        double number = scanner.nextDouble();
        return number;

    }

}
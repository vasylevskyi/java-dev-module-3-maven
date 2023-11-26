package ua.goit;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumCalculator calculator = new SumCalculator();

        System.out.println("Input number which sum you want to calculate:");

        int number = scanner.nextInt();
        int sum = calculator.sum(number);

        System.out.printf("Sum of " + number + " = " + sum);

    }

}

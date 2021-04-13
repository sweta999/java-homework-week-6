package javaprogrammes;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class Average13 {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter Second Number:");
        double num2 = scanner.nextDouble();

        System.out.print("Enter Third Number: ");
        double num3 = scanner.nextDouble();
        scanner.close();
        System.out.print("The average of entered numbers is:" + average(num1, num2, num3));

    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }


}

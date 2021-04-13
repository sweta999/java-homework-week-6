package javaprogrammes;

/**
 * This is a program to convert temperature value in degree Fahrenheit to degree Celsius
 * Formula is ((F-32) * 5/9 = 0°C  (//Alt+0176 to add degree symbol)
 */

import java.util.Scanner;

public class Temperature7 {
    public static void main(String[] args) {

        float cel, far;

        Scanner s = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("Enter temp. in Fahrenheit: ");
        far = s.nextInt();

        cel = (far - 32) * 5 / 9;

        System.out.println(" ");
        System.out.println("Temp. in Celsius: " + cel);

    }


}

package javaprogrammes;

/**
 * Program to calculate area of circle with user interaction.
 * User will be prompt to enter the radius and the result will be calculated based on provided radius value.
 * Formula of Area is A=PI*r*r
 */

import java.util.Scanner;

public class AreaofCircle6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Enter the radius : ");
        /*We are storing the entered radius in double
         * because a user can enter radius in decimals
         */
        double radius = sc.nextDouble();
        //Area = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is : " + area);

    }

}

///*  Program 2 :
// *   Area of a Circle without Scanner method (No User interaction)
//*/
//Public class AreaofCircle {
//    public static void main(String[] args){
// int radius = 3;
// double area = Math.PI * (radius*radius);
// System.out.println("The area of circle is : " + area);

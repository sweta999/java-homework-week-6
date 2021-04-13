package javaprogrammes;

/**
 * Write a program to calculate the area of a triangle
 * Note : Program in Main method is for Prompt User.
 */

import java.util.Scanner;

public class AreaofTriangle8 {

    //Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Enter the base of the Triangle : ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the Triangle : ");
        double height = scanner.nextDouble();

        //Area = (base * height)/2
        double area = (base * height) / 2;
        System.out.print("Area of Triangle is :   " + area);

    }

}

///*  Program 2 :
// *   Area of a triangle without Scanner method (No User interaction)
//*/
//Public class AreaofTriangle {
//    public static void main(String[] args){

//double base = 6;
//double height = 20;
//double area = (base * height) / 2;

//print statement
//System.out.println(" ");
//System.out.println("Area of Triangle is : " + area);

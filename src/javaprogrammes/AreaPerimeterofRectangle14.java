package javaprogrammes;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data is given
 * Program in Main method is without User interaction.
 * Test Data : Width-5.6, Height-8.5
 * Expected Output for Area is : 5.6 * 8.5 = 47.60
 * Expected Output for Perimeter is:  2 * (5.6 + 8.5) = 28.20
 */

public class AreaPerimeterofRectangle14 {
    //Main method
    public static void main(String[] args) {
        double height = 8.5;
        double width = 5.6;
        double area = height * width;
        double perimeter = 2 * (height + width);

        //print statement for Area of Rectangle
        System.out.println(" ");
        System.out.println("Area is 5.6 * 8.5 : " + area);

        //print statement for Perimeter of Rectangle
        System.out.println(" ");
        System.out.println("Perimeter is 2* (5.6 + 8.5) : " + perimeter);

    }
}


/* Program 2
 * Area and Perimeter of Rectangle
 * Input from the User
 */

//import java.util.Scanner;

//public class AreaPerimeterofRectangle14 {

//public static void main(String[] args) {
// Scanner scanner = new Scanner(system.in)

// System.out.println("Enter the length of Rectangle: ");
//double length = scanner.nextDouble();

// System.out.println("Enter the width of Rectangle: ");
// double width = scanner.nextDouble();

//Area = length*width;  - (This will be a statement in Main method)
//double area = length*width;
//System.out.println("Area of Rectangle is: "+area);

//Perimeter = 2*(length+Width);  - (This will be a statement in Main method)
//double perimeter = 2 * (length + width);
//System.out.println("Perimeter of Rectangle is: "+perimeter);


package javaprogrammes;

/**
* Write a Java program to swap two variables
* Two variables are taken as input
 */

public class Swapvariables15 {

    public static void main(String[] args) {

        //Main method
        float first = 3.45f, second = 5.94f;

        //print statement
        System.out.println(" ");
        System.out.println("--Before swap--");
        System.out.println("First number = " +first );
        System.out.println("Second number = " +second);

        //Value of first is assigned to temporary
        float temporary = first;

        //Value of second is assigned to first
        first = second;

        //Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        //print statement
        System.out.println("--After swap--");
        System.out.println("First number = "+first);
        System.out.println("Second number = "+second);

    }
}

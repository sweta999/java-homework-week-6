package javaprogrammes;

/**
 * Write a Java program that takes a number as input and prints its multiplication table up to 10
 */


import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        //Main method
        int i, no, table = 1;

        //Below code is used to receive input from keyboard
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");

        //Below method nextInt() is used to get integer type value from keyboard
        no = s.nextInt();
        for (i = 1; i <= 10; i++) {
            table = no * i;
            System.out.print(" ");
            System.out.println(no+" * "+i +" = " +table);
        }
    }

}

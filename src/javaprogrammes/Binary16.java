package javaprogrammes;

/**
 * Write a Java program to add two binary numbers
 * Input Data is given
 * Input first binary number : 10
 * Input second binary number : 11
 * Expected Output : 101
 */

import java.util.Scanner;

public class Binary16 {
    public static void main(String[] args) {

        long binary1, binary2;    //Two variables to hold two input binary numbers
        int i = 0, remainder = 0;
        int[] sum = new int[10];  //This is to hold the output binary number

        Scanner scanner = new Scanner(System.in); //To read the input binary numbers entered by user

        System.out.println(" ");
        System.out.print("Input first binary number: ");
        binary1 = scanner.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = scanner.nextLong();

        while (binary1 != 0 || binary2 != 0){
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        if (remainder != 0){
            sum[i++] = remainder;
        }

        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.print("\n");

    }

}



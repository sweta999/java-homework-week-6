package javaprogrammes;

/**
 * This is a program for a calculator with addition, subtraction, multiplication and division methods (without parameters)
 * using string concatenation methods.
 * Two Static and Two Instance methods
 */

//I have created Instance and Static method but I don't know how to write a program for a Calculator.

public class Calculator5 {
    //Instance Variables
    int k = 78;
    int l = 9;

    //Static Variables
    static int m = 45;
    static int n = 4;

    //Instance method
    void ins() {
        System.out.println("First Method");
        //print statement for Instance Variable
        System.out.println(k);
        System.out.println(l);
        //print statement for Static Variable
        System.out.println(m);
        System.out.println(n);
    }

    //Static method
    void sta() {
        System.out.println("Second Method");
        //print statement for Static Variable
        System.out.println(Calculator5.m);
        System.out.println(Calculator5.n);

        //print statement for Instance Variable
        Calculator5 sum = new Calculator5();
        System.out.println(sum.k);
        System.out.println(sum.l);
    }

    //Main Method
    public static void main(String[] args) {

    }

}






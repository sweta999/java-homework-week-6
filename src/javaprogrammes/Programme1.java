package javaprogrammes;

/**
 * 1.Declare two instance variables
 * 2.Declare one instance method
 * 3.Call both instance variables into the instance method inside the print statement
 * 4.Declare the Main method
 * 5.Call the above instance method into the Main method and run the programme.
 */

public class Programme1 {
    // Declaring two instance variables - step 1
    int a = 16; // variable 1
    int b = 27; // variable 2

    //instance method - step 2
    void m1() {
        //instance variables inside instance method and the print statement - step 3
        System.out.println(a); //instance variable 1 called in print statement
        System.out.println(b); //instance variable 2 called in print statement
    }

    //Main method - step 4
    public static void main(String[] args) {

        //Object declaring and calling the instance method in main method - step 5
        Programme1 intvarab = new Programme1();

        //print statement
        System.out.println(" ");
        System.out.println(intvarab.a);
        System.out.println(intvarab.b);

    }


}

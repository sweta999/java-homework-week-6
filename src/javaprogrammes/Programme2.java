package javaprogrammes;

/**
 * 1. Declare two static variables
 * 2. Declare one static method
 * 3. Call both static variables into the static method inside the print statement
 * 4. Declare the Main method
 * 5. Call the static method into the Main method and Run the programme
 */

public class Programme2 {
    //Declaring two static variables - step 1
    static int c = 34; // static variable 1
    static int d = 77; // static variable 2

    //Static method - step 2
    static void m2() {
        //calling static variables into the static method and inside the print statement - step 3
        System.out.println(c); //static variable 1 called in print statement
        System.out.println(d); //static variable 2 called in print statement
    }

    //Main method - step 4
    public static void main(String[] args) {

        //calling static method directly in main method - step 5

        //print statement
        System.out.println(" ");
        m2(); //calling static method

    }


}




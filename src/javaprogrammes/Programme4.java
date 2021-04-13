package javaprogrammes;

/**
 * 1. Declare two instance and two static variables
 * 2. Declare one instance method
 * 3. Declare one static method
 * 4. Call all four instance and static variables into both instance and static methods inside the print statement
 * 5. Declare the Main method
 * 6. Call both instance and static methods into the Main method and run the programme
 */

public class Programme4 {
    //Declaring two instance variable and two static variables - step 1
    int l = 10; //instance variable 1
    int m = 20; //instance variable 2
    static int p = 30; //static variable 1
    static int q = 40; //static variable 2

    //instance method - step 2
    void h1() {
        //instance and static variables in the instance method and inside the print statement - step 4
        System.out.println(l);             //instance variable called in instance print statement
        System.out.println(m);             //instance variable called in instance print statement
        System.out.println(Programme4.p);  //static variable called in instance print statement via class
        System.out.println(Programme4.q);  //static variable called in instance print statement via class
    }

    //static method - step 3
    static void h2() {
        //instance and static variables in the static method and inside the print statement - step 4

        //object created to call instance variable in static method
        Programme4 intp = new Programme4();  //object created

        System.out.println(intp.l);          //Instance variable called in static print statement via object
        System.out.println(intp.m);          //Instance variable called in static print statement via object
        System.out.println(Programme4.p);    //static variable called in static print statement via class
        System.out.println(Programme4.q);    //static variable called in static print statement via class

    }

    //Main method - step 5
    public static void main(String[] args) {

        //object created to call instance method in Main method
        Programme4 intp = new Programme4();

        //calling instance and static methods in main method - step 6
        //print statement
        System.out.println(" ");
        intp.h1(); //instance method calling
        System.out.println(" ");
        Programme4.h2(); //static method calling via class


    }


}

package javaprogrammes;

/**
 * 1. Declare one instance and one static variable
 * 2. Declare one instance method
 * 3. Declare one static method
 * 4. Call both instance and static variables into both instance and static methods inside the print statement
 * 5. Declare the Main method
 * 6. Call both instance and static methods into the Main method and run the programme
 */

public class Programme3 {
    //Declaring one instance variable and one static variable - step 1
    int s = 999; //instance variable
    static String name = "Sweta"; // static variable

    //instance method - step 2
    void m1() {
        //instance and static variables in instance method and inside print statement - step 4
        System.out.println(s);               //instance variable called in instance print statement
        System.out.println(Programme3.name); //static variable called in instance print statement via class

    }

    //static method - step 3
    static void m2() {
        //instance and static variables in static method and inside print statement - step 4

        //object created to call instance variable in static method
        Programme3 alphas = new Programme3(); //object created

        System.out.println(alphas.s);        //instance variable called in static print statement
        System.out.println(Programme3.name); //static variable called in static print statement via class
    }

    //Main method - step 5
    public static void main(String[] args) {

        //object created to call instance method in main method
        Programme3 alphas = new Programme3();

        //calling instance and static method in main method - step 6
        // print statement
        System.out.println(" ");
        alphas.m1(); //instance method calling
        System.out.println(" ");
        Programme3.m2(); //static method calling via class

    }


}


//* Java Practice.. In this Repository you'd learn the fundamentals of Java and also look at Object Oriented Programming(OOP)

//todo: Simple syntax of a java program
public class App { //! Note: The class name must be the same as the filename and use the .java extension  
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Java!" ); //* This is how to print out to the console in java
        //* Calling the variable function below
        variables();
    }


//! Note: Every Java statement ends with a semicolumn



//* Variables example using a function
//* Variables can be created easily by indentifying the datatype, followedby the variable name and the the value.. */
public static void variables() {
    int num_one = 2;
    int num_two = 4;
    int total = num_one + num_two;
    System.out.println(total);

}
}
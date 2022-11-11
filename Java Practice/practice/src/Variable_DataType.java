
//? Variables and datatypes

/* Data types are divided into two groups:

Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)


byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int  	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values

*/


public class Variable_DataType {
    public static void main(String[] args) {
        //todo: Basic datatypes to create a varable
        String name = "Daniel"; //* Creating a string variable
        int age = 22; //* Creating an iteger variable
        double weight = 22.3; //* Creating a double variable
        char init = 'D'; //* Creating a char variable
        boolean myBool = false; //* Creating a boolean variable

//* outputing the variable
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My weight is " + weight);
        System.out.println("My initial is " + init);
        System.out.println("My height value is " + myBool);
   

//* Performing calculations with variables
     int x = 5;
     int y = 6;
     int z = 7;
     System.out.println("The total is ");
     System.out.println(x + y + z);

    }
}

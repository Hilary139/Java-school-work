
//* If..Else tutorial.. Conditional statements

/*

 * Java supports the usual logical conditions from mathematics:

Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
Equal to a == b
Not Equal to: a != b
You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

 */

public class IfElse {
    public static void main (String[] args) {
        // example: Working with only If statement
        
        int age = 33;
        if (age > 20){
            System.out.println("Age is greater than 20");
        }

        // working with bith if...else statements
        int num_one = 1;
        int num_two = 2;

        if(num_one > num_two){
            System.out.println("Num_one is greater than num_two");
        }else{
            System.out.println("Num_one is less than num_two");
        }
    

        // Working with if..else fi and else
        int x = 2;
        int y = 9;
        int z = 4;

        if (x == y){
            System.out.println("x is equal to y");
        }else if(y > z){
            System.out.println("y is less than z");
        }else{
            System.out.println("x is greater than y");
        }

    }
    
}

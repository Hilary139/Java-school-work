// scanner assignment

// importing the scanner class
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        // creating the scanner object
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter age - ");
        int age = sc.nextInt();
        System.out.println("The number entered is " + age);

    }
}

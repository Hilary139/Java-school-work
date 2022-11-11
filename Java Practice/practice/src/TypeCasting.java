/*
 Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

 */

public class TypeCasting {
    public static void main(String[] args) {
        // Widening Casting Or Implicit conversions
        int age = 22;
        double age_update = age;
        System.out.println("The  Widening age is " + age_update);

        // Narrowing casting Or Explicit conversions
        double num = 11.2;
        int num_update = (int) num;
        System.out.println("The Narrow age is " + num_update);
    }
}
                                                            
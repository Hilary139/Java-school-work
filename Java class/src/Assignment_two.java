public class Assignment_two {
    public static void main(String[] args) {
        // strings and integer concatinations
        String A = "133";
        String B = "223";
        int C = 8;
        int E = 9;
        System.out.println(B + C);
        System.out.println(A + B + C);
        System.out.println( A + C + E);

        // joining integers together
        int D = 13;
        int F = 15;
        System.out.println(D + F);
    }

}

//! Note:
//     When there at least one string in the addition.. if there are more than one integers the integers will not add but concatinate insated.
//      This output will give a number value in the form of a string and an integer. Reason being:
//      When adding a string and an integer together, it concatenates them like its writing a sentence
//     This case is very different when working with two integers because they are taken as numerical values, meaning
//      they use numerical operations seen in the example below:

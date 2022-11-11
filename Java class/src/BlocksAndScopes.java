public class BlocksAndScopes {
    public static void main(String[] args) {}
        public static void methodWithNestedBlocks() {
    //        aNumber comes into existence
            int aNumber = 10;
    
            System.out.println("In outer block, aNumber is " + aNumber);
            {
    //            anotherNumber comes into existence
                int anotherNumber = 512;
                System.out.println("In inner block, aNumber is " + aNumber + "and another number is " + anotherNumber);
            }
    //        anotherNumber ceases to exist; it goes out of scope
            System.out.println("In outer block, aNumber is " + aNumber);
        }
    //    aNumber ceases to exist; it goes out of scope
}

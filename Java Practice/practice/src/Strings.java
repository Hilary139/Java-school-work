
//? A String variable contains a collection of characters surrounded by double quotes:

public class Strings {
    public static void main (String[] args){
        //*  String Variable.. 
        String name = "Dave";
        System.out.println("name is " + name);


        //*  String Length.. Using the length() method to get the length of the string variable
        String text ="qweireutfsdknbvdsauikjrufytirusilxchfrueiwo";
        System.out.println("text length is " + text.length());


        //*  More String methods toUpperCase() & toLowerCase()
        String upper ="qweireutfsdknbvdsauikjrufytirusilxchfrueiwo";
        System.out.println("text is in upper case " + upper.toUpperCase());

        String lower ="AJDFJDJIRURUEIKCSK";
        System.out.println("text is in lower case " + lower.toLowerCase());

 /* Finding a Character in a String
    The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
 */
       String text_input = "Please i need help!";
       System.out.println("The index i'm looking for is: " + text_input.indexOf("need"));

      // Replace String
      String text_replace = "Please i need help!";
      System.out.println("Replaced word: " + text_replace.replace('i', 'u'));



      //*  Concatination
      String firstName = "Mack";
      String lastName = "Smith";
      System.out.println("Concatination: " + firstName + " " + lastName);

      // we can also perform concatination using the concat() method
      String UserName = "Mack";
      String MiddleName = "Smith";
      System.out.println("Concatination method: " + UserName.concat( MiddleName));


      /*  Escape character	Result	Description
                \'	'	Single quote
                \"	"	Double quote
                \\	\	Backslash
       */

       //*  The sequence \"  inserts a double quote in a string:
       String txt = "We are the so-called \"Vikings\" from the north.";
       System.out.println(txt);

       //*  The sequence \'  inserts a single quote in a string:
       String txt_two = "It\'s alright.";
       System.out.println(txt_two);

       //* The sequence \\  inserts a single backslash in a string:
       String txt_three = "The character \\ is called backslash.";
       System.out.println(txt_three);


//*  Other common escape sequences that are valid in Java are:

       /*
                Code  Result	
                \n	    New Line	
                \r	    Carriage Return	
                \t	    Tab	
                \b	    Backspace	
                \f	    Form Feed
        */


    }



}
